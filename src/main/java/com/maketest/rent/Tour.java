package com.maketest.rent;

import java.time.LocalDate;

public class Tour {

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


}
