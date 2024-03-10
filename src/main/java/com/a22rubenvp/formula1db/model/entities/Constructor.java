package com.a22rubenvp.formula1db.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CONSTRUCTORS")
public class Constructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONSTRUCTORID", nullable = false)
    private Integer id;

    @Column(name = "CONSTRUCTORREF", nullable = false)
    private String reference;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "URL", nullable = false)
    private String url;

    public Constructor() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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