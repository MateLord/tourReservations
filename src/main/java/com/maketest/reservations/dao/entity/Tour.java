package com.maketest.reservations.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Tour {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private enum tourType{Historical, Extreme}
    private LocalDate date;
    private String employee;
    private int maxPlaces;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public int getMaxPlaces() {
        return maxPlaces;
    }

    public void setMaxPlaces(int maxPlaces) {
        this.maxPlaces = maxPlaces;
    }

    public Tour(LocalDate date, String employee, int maxPlaces) {
        this.date = date;
        this.employee = employee;
        this.maxPlaces = maxPlaces;
    }

    public Tour() {
    }


}
