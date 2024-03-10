package com.a22rubenvp.formula1db.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEASONS")
public class Season {
    @Id
    @Column(name = "YEARID", nullable = false)
    private Integer id;

    @Column(name = "URL", nullable = false)
    private String url;

    public Season() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}