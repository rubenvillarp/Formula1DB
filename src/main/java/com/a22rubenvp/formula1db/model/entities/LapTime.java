package com.a22rubenvp.formula1db.model.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "LAP_TIMES")
public class LapTime {
    @EmbeddedId
    private LapTimeId id;

    @MapsId("raceid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "RACEID", nullable = false)
    private Race race;

    @MapsId("driverid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "DRIVERID", nullable = false)
    private Driver driver;

    @Column(name = "POSITION")
    private Integer position;

    @Column(name = "TIME")
    private String time;

    @Column(name = "MILLISECONDS")
    private Integer milliseconds;

    public LapTime() {
    }

    public LapTimeId getId() {
        return id;
    }

    public void setId(LapTimeId id) {
        this.id = id;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }

}