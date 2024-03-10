package com.a22rubenvp.formula1db.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "STATUS")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STATUSID", nullable = false)
    private Integer id;

    @Column(name = "STATUS", nullable = false)
    private String status;

    public Status() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}