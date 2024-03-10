package com.a22rubenvp.formula1db.model.dto;

import java.io.Serializable;

public class DriverDto implements Serializable {
    private final String forename;
    private final String surname;

    public DriverDto(String forename, String surname) {
        this.forename = forename;
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

}