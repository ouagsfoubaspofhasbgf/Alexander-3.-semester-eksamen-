package facades;

import dtos.RenameMeDTO;
import entities.RenameMe;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

//import errorhandling.RenameMeNotFoundException;
import utils.EMF_Creator;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class FacadeExample {

    private static FacadeExample instance;

    private static EntityManagerFactory emf;
    
    //Private Constructor to ensure Singleton

    private FacadeExample() {}
    
    
    /**
     * 
     * @param _emf
     * @return an instance of this facade class.
     */
    public static FacadeExample getFacadeExample(EntityManagerFactory _emf) {

        if (instance == null) {

            emf = _emf;

            instance = new FacadeExample();

        }

        return instance;

    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public BookingDTO create(BookingDTO rm){

        Booking rme = new Booking(rm.getDateAndTime, rm.getDuration());

        EntityManager em = getEntityManager();

        try {

            em.getTransaction().begin();

            em.persist(rme);

            em.getTransaction().commit();

        } finally {

            em.close();

        }

        return new BookingDTO(rme);

    }
    public BookingDTO getById(long id) { //throws RenameMeNotFoundException {

        EntityManager em = emf.createEntityManager();

        Booking rm = em.find(Booking.class, id);

//        if (rm == null)
//            throw new RenameMeNotFoundException("The RenameMe entity with ID: "+id+" Was not found");

        return new BookingDTO(rm);

    }
    
    //TODO Remove/Change this before use

    public long getRenameMeCount(){

        EntityManager em = getEntityManager();

        try{

            long BookingCount = (long)em.createQuery("SELECT COUNT(r) FROM Booking r").getSingleResult();

            return BookingCount;

        }finally{

            em.close();
        }
    }
    
    public List<BookingDTO> getAll(){

        EntityManager em = emf.createEntityManager();

        TypedQuery<Booking> query = em.createQuery("SELECT r FROM Booking r", Booking.class);

        List<Booking> rms = query.getResultList();

        return BookingDTO.getDtos(rms);

    }
    
    public static void main(String[] args) {

        emf = EMF_Creator.createEntityManagerFactory();

        FacadeExample fe = getFacadeExample(emf);

        fe.getAll().forEach(dto->System.out.println(dto));

    }

}
