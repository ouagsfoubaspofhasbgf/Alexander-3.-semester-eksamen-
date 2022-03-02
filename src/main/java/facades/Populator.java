/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.BookingDTO;
import dtos.CarDTO;
import dtos.RenameMeDTO;
import entities.Booking;
import entities.RenameMe;
import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

/**
 *
 * @author tha
 */
public class Populator {

    public static void populate(){



        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();



        FacadeExample fe = FacadeExample.getFacadeExample(emf);



        fe.create(new BookingDTO(new Booking("07-09-1988-2503", "06:30")));

        fe.create(new BookingDTO(new Booking("07-09-1988-2503", "06:30")));

        fe.create(new BookingDTO(new Booking("07-09-1988-2503", "06:30")));

        fe.create(new BookingDTO(new Booking("07-09-1988-2503", "06:30")));

        fe.create(new BookingDTO(new Booking("07-09-1988-2503", "06:30")));

        fe.create(new BookingDTO(new Booking("07-09-1988-2503", "06:30")));

        fe.create(new BookingDTO(new Booking("07-09-1988-2503", "06:30")));

        fe.create(new BookingDTO(new Booking("07-09-1988-2503", "06:30")));

        fe.create(new BookingDTO(new Booking("07-09-1988-2503", "06:30")));

        fe.create(new BookingDTO(new Booking("07-09-1988-2503", "06:30")));



        fe.create(new CarDTO(new Car("48475313", "Elise", "Lotus", 1988)));

        fe.create(new CarDTO(new Car("48475313", "Elise", "Lotus", 1988)));

        fe.create(new CarDTO(new Car("48475313", "Elise", "Lotus", 1988)));

        fe.create(new CarDTO(new Car("48475313", "Elise", "Lotus", 1988)));

        fe.create(new CarDTO(new Car("48475313", "Elise", "Lotus", 1988)));

        fe.create(new CarDTO(new Car("48475313", "Elise", "Lotus", 1988)));

        fe.create(new CarDTO(new Car("48475313", "Elise", "Lotus", 1988)));

        fe.create(new CarDTO(new Car("48475313", "Elise", "Lotus", 1988)));

        fe.create(new CarDTO(new Car("48475313", "Elise", "Lotus", 1988)));

        fe.create(new CarDTO(new Car("48475313", "Elise", "Lotus", 1988)));



        fe.create(new WashingAssistentDTO(new WashingAssistent("Alexander Stub Michelsen", "English", 2, 150)));

        fe.create(new WashingAssistentDTO(new WashingAssistent("Alexander Stub Michelsen", "British", 1, 150)));

        fe.create(new WashingAssistentDTO(new WashingAssistent("Alexander Stub Michelsen", "Danish", 3, 150)));

        fe.create(new WashingAssistentDTO(new WashingAssistent("Alexander Stub Michelsen", "English", 2, 150)));

        fe.create(new WashingAssistentDTO(new WashingAssistent("Alexander Stub Michelsen", "British", 1, 150)));

        fe.create(new WashingAssistentDTO(new WashingAssistent("Alexander Stub Michelsen", "Danish", 3, 150)));

        fe.create(new WashingAssistentDTO(new WashingAssistent("Alexander Stub Michelsen", "English", 2, 150)));

        fe.create(new WashingAssistentDTO(new WashingAssistent("Alexander Stub Michelsen", "British", 1, 150)));

        fe.create(new WashingAssistentDTO(new WashingAssistent("Alexander Stub Michelsen", "British", 3, 150)));

        fe.create(new WashingAssistentDTO(new WashingAssistent("Alexander Stub Michelsen", "Britsh", 3, 150)));

    }
    
    public static void main(String[] args) {
        populate();
    }

}
