package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity

@NamedQuery(name = "Car.deleteAllRows", query = "DELETE from Car")

public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String registrationNumber;

    private int Year;

    public Car() {
    }

    // TODO, delete this class, or rename to an Entity class that makes sense for what you are about to do
    // Delete EVERYTHING below if you decide to use this class, it's dummy data used for the initial demo


    public Car(Long id, String dateAndTime, String duration) {

        this.id = id;

        DateAndTime = dateAndTime;

        Duration = duration;
    }

    public Long getId() {

        return id;

    }

    public void setId(Long id) {

        this.id = id;

    }

    public String getDateAndTime() {

        return DateAndTime;

    }

    public void setDateAndTime(String dateAndTime) {

        DateAndTime = dateAndTime;

    }

    public String getDuration() {

        return Duration;

    }

    public void setDuration(String duration) {

        Duration = duration;

    }

}
