package com.a22rubenvp.formula1db.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CIRCUITS")
public class Circuit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CIRCUITID", nullable = false)
    private Integer id;

    @Column(name = "CIRCUITREF", nullable = false)
    private String reference;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "LAT")
    private Double latitude;

    @Column(name = "LNG")
    private Double longitude;

    @Column(name = "ALT")
    private Integer altitude;

    @Column(name = "URL", nullable = false)
    private String url;

    public Circuit() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}