/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Car;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tha
 */
public class CarDTO {

    private Long id;

    private String registrationNumber;

    private String Brand;

    private String Make;

    private int Year;

    public CarDTO() {

    }

    public CarDTO(Long id, String registrationNumber, String brand, String make, int year) {

        this.id = id;

        this.registrationNumber = registrationNumber;

        Brand = brand;

        Make = make;

        Year = year;

    }

    public static List<CarDTO> getDtos(List<Car> rms){

        List<CarDTO> rmdtos = new ArrayList();

        rms.forEach(rm->rmdtos.add(newCarDTO(rm)));

        return rmdtos;

    }


    public CarDTO(CarDTO rm) {

        if(rm.getId() != null)

            this.registrationNumber = registrationNumber;

        Brand = brand;

        Make = make;

        Year = year;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public String toString() {return "CarDTO{" + "id=" + id + ", registrationNumber='" + registrationNumber + '\'' + ", Brand='" + Brand + '\'' + ", Make='" + Make + '\'' + ", Year=" + Year + '}';

    }

}
