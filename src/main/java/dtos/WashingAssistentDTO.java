package dtos;

import java.util.ArrayList;
import java.util.List;

public class WashingAssistentDTO {

    Long id;

    private String name;

    private String primaryLanguage;

    private String yearsOfExperience;

    private String pricePrHour;

    public WashingAssistentDTO() {

    }

    public WashingAssistentDTO(String WashingAssistentDTO) {

        Long id;

        String name;

        String primaryLanguage;

        String yearsOfExperience;

        String pricePrHour;
    }

    public static List<WashingAssistentDTO> getDtos(List<WashingAssistent> rms){

        List<WashingAssistentDTO> rmdtos = new ArrayList();

        rms.forEach(rm->rmdtos.add(new WashingAssistentDTO(rm)));

        return rmdtos;

    }


    public WashingAssistentDTO(WashingAssistent rm) {

        if(rm.getId() != null)

        this.id = id;

        this.DateAndTime = DateAndTime;

        this.Duration = Duration;

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

    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
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

    public WashingAssistentDTO(Long id, String name, String primaryLanguage, String yearsOfExperience, String pricePrHour) {

        this.id = id;

        this.name = name;

        this.primaryLanguage = primaryLanguage;

        this.yearsOfExperience = yearsOfExperience;

        this.pricePrHour = pricePrHour;

    }

    @Override
    public String toString() {

        return "WashingAssistentDTO{" + "id=" + id + ", name='" + name + '\'' + ", primaryLanguage='" + primaryLanguage + '\'' + ", yearsOfExperience='" + yearsOfExperience + '\'' + ", pricePrHour='" + pricePrHour + '\'' + '}';

    }

}

