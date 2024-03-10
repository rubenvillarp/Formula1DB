package com.a22rubenvp.formula1db.model.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "DRIVERS")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DRIVERID", nullable = false)
    private Integer id;

    @Column(name = "DRIVERREF", nullable = false)
    private String reference;

    @Column(name = "NUMBER")
    private Integer number;

    @Column(name = "CODE", length = 3)
    private String code;

    @Column(name = "FORENAME", nullable = false)
    private String forename;

    @Column(name = "SURNAME", nullable = false)
    private String surname;

    @Column(name = "DOB")
    private LocalDate dateOfBirth;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "URL", nullable = false)
    private String url;

    public Driver() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}