package com.a22rubenvp.formula1db.model.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "RACES")
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RACEID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "SEASON", nullable = false)
    private Season season;

    @Column(name = "ROUND", nullable = false)
    private Integer round;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "CIRCUITID", nullable = false)
    private Circuit circuit;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DATE", nullable = false)
    private LocalDate date;

    @Column(name = "TIME")
    private LocalTime time;

    @Column(name = "URL")
    private String url;

    @Column(name = "FP1_DATE")
    private LocalDate fp1Date;

    @Column(name = "FP1_TIME")
    private LocalTime fp1Time;

    @Column(name = "FP2_DATE")
    private LocalDate fp2Date;

    @Column(name = "FP2_TIME")
    private LocalTime fp2Time;

    @Column(name = "FP3_DATE")
    private LocalDate fp3Date;

    @Column(name = "FP3_TIME")
    private LocalTime fp3Time;

    @Column(name = "QUALI_DATE")
    private LocalDate qualiDate;

    @Column(name = "QUALI_TIME")
    private LocalTime qualiTime;

    @Column(name = "SPRINT_DATE")
    private LocalDate sprintDate;

    @Column(name = "SPRINT_TIME")
    private LocalTime sprintTime;

    public Race() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Circuit getCircuit() {
        return circuit;
    }

    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getFp1Date() {
        return fp1Date;
    }

    public void setFp1Date(LocalDate fp1Date) {
        this.fp1Date = fp1Date;
    }

    public LocalTime getFp1Time() {
        return fp1Time;
    }

    public void setFp1Time(LocalTime fp1Time) {
        this.fp1Time = fp1Time;
    }

    public LocalDate getFp2Date() {
        return fp2Date;
    }

    public void setFp2Date(LocalDate fp2Date) {
        this.fp2Date = fp2Date;
    }

    public LocalTime getFp2Time() {
        return fp2Time;
    }

    public void setFp2Time(LocalTime fp2Time) {
        this.fp2Time = fp2Time;
    }

    public LocalDate getFp3Date() {
        return fp3Date;
    }

    public void setFp3Date(LocalDate fp3Date) {
        this.fp3Date = fp3Date;
    }

    public LocalTime getFp3Time() {
        return fp3Time;
    }

    public void setFp3Time(LocalTime fp3Time) {
        this.fp3Time = fp3Time;
    }

    public LocalDate getQualiDate() {
        return qualiDate;
    }

    public void setQualiDate(LocalDate qualiDate) {
        this.qualiDate = qualiDate;
    }

    public LocalTime getQualiTime() {
        return qualiTime;
    }

    public void setQualiTime(LocalTime qualiTime) {
        this.qualiTime = qualiTime;
    }

    public LocalDate getSprintDate() {
        return sprintDate;
    }

    public void setSprintDate(LocalDate sprintDate) {
        this.sprintDate = sprintDate;
    }

    public LocalTime getSprintTime() {
        return sprintTime;
    }

    public void setSprintTime(LocalTime sprintTime) {
        this.sprintTime = sprintTime;
    }

}