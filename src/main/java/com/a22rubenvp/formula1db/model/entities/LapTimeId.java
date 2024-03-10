package com.a22rubenvp.formula1db.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class LapTimeId implements Serializable {
    //private static final long serialVersionUID = -3217553539648286121L;
    @Column(name = "RACEID", nullable = false)
    private Integer raceid;

    @Column(name = "DRIVERID", nullable = false)
    private Integer driverid;

    @Column(name = "LAP", nullable = false)
    private Integer lap;

    public LapTimeId() {
    }

    public Integer getRaceid() {
        return raceid;
    }

    public void setRaceid(Integer raceid) {
        this.raceid = raceid;
    }

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public Integer getLap() {
        return lap;
    }

    public void setLap(Integer lap) {
        this.lap = lap;
    }

}