package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.BookingDTO;
import utils.EMF_Creator;
import facades.FacadeExample;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

//Todo Remove or change relevant parts before ACTUAL use
@Path("/Booking")

public class WasingAssistent {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
       
    private static final FacadeExample FACADE =  FacadeExample.getFacadeExample(EMF);

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
            
    @GET

    @Produces({MediaType.APPLICATION_JSON})

    public String demo() {
        return "{\"msg\":\"Welcome to booking resources\"}";
    }

    @Path("getAll")

    @GET

    @Produces({MediaType.APPLICATION_JSON})

    public String getRenameMeCount() {
       
        long count = FACADE.getRenameMeCount();

        //System.out.println("--------------->"+count);

        return "{\"getAll\":"+count+"}";  //Done manually so no need for a DTO

    }

    @GET

    @Produces(MediaType.APPLICATION_JSON)

    @Path("{getAll}")

    public String getBook(@PathParam("getAll") String key) throws IOException {

        BookingDTO Bookings = FACADE.getAll(getAll);

        return GSON.toJson(Bookings);

    }

}
