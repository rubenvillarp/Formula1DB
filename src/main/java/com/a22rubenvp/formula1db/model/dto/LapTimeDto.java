package com.a22rubenvp.formula1db.model.dto;

import java.io.Serializable;

public class LapTimeDto implements Serializable {
    private final Integer idLap;
    private final Integer milliseconds;

    public LapTimeDto(Integer idLap, Integer milliseconds) {
        this.idLap = idLap;
        this.milliseconds = milliseconds;
    }

    public Integer getIdLap() {
        return idLap;
    }

    public Integer getMilliseconds() {
        return milliseconds;
    }

}