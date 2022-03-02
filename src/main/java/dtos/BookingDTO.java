/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.RenameMe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tha
 */
public class BookingDTO {

    private Long id;

    private String DateAndTime;

    private String Duration;

    public BookingDTO() {

    }

    public BookingDTO(String BookingDTO) {

        Long id;

        String DateAndTime;

        String Duration;
    }

    public static List<BookingDTO> getDtos(List<Booking> rms){
        List<BookingDTO> rmdtos = new ArrayList();
        rms.forEach(rm->rmdtos.add(new BookingDTO(rm)));
        return rmdtos;
    }


    public BookingDTO(Booking rm) {
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

    public BookingDTO(Long id, String dateAndTime, String duration) {

        this.id = id;

        DateAndTime = dateAndTime;

        Duration = duration;

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "BookingDTO{" +  "id=" + id + ", DateAndTime='" + DateAndTime + '\'' +  ", Duration='" + Duration + '\'' +  '}';
    }
}
