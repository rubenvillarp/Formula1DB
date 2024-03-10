package com.a22rubenvp.formula1db.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PitStopId implements Serializable {
    @Column(name = "RACEID", nullable = false)
    private Integer raceid;

    @Column(name = "DRIVERID", nullable = false)
    private Integer driverid;

    @Column(name = "STOP", nullable = false)
    private Integer stop;

    public PitStopId() {
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

    public Integer getStop() {
        return stop;
    }

    public void setStop(Integer stop) {
        this.stop = stop;
    }

}