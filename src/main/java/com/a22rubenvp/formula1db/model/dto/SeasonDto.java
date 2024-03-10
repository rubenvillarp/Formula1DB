package com.a22rubenvp.formula1db.model.dto;

import java.io.Serializable;

public class SeasonDto implements Serializable {
    private final Integer id;

    public SeasonDto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

}