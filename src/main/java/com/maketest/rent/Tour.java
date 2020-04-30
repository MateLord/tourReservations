package com.maketest.rent;

import java.time.LocalDate;

public class Tour {

    private Long id;
    private enum tourType{Historical, Extreme};
    private LocalDate date;
    private String employee;
    private int maxPlaces;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Tour(Long id, LocalDate date, String employee, int maxPlaces) {
        this.id = id;
        this.date = date;
        this.employee = employee;
        this.maxPlaces = maxPlaces;
    }


}
