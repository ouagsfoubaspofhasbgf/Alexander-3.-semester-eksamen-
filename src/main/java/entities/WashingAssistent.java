package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity

@NamedQuery(name = "WasingAssistent.deleteAllRows", query = "DELETE from WasingAssistent")

public class RenameMe implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String primaryLanguages;

    private String yearsOfExperience;

    private String pricePrHour;

    }
    
    public WashingAssistent() {

    }
    
    // TODO, delete this class, or rename to an Entity class that makes sense for what you are about to do
    // Delete EVERYTHING below if you decide to use this class, it's dummy data used for the initial demo


    public WashingAssistent(Long id, String name, String primary, String yearsOfExperience, String price) {

        this.id = id;

        this.name = name;

        this.primary = primary;

        this.years = years;

        this.experience = experience;

        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimaryLanguages() {
        return primaryLanguages;
    }

    public void setPrimaryLanguages(String primaryLanguages) {
        this.primaryLanguages = primaryLanguages;
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getPricePrHour() {
        return pricePrHour;
    }

    public void setPricePrHour(String pricePrHour) {
        this.pricePrHour = pricePrHour;
    }
}
