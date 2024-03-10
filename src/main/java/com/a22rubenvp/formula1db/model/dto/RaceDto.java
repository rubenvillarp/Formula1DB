package com.a22rubenvp.formula1db.model.dto;

import java.io.Serializable;

public class RaceDto implements Serializable {
    private final String name;

    public RaceDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}