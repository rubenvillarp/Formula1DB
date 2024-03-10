package com.a22rubenvp.formula1db.model.dao;

import com.a22rubenvp.formula1db.model.JpaUtil;
import com.a22rubenvp.formula1db.model.dto.DriverDto;
import com.a22rubenvp.formula1db.model.entities.Driver;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class DriverDao implements IDao<Driver> {
    EntityManager em;

    public DriverDao() {
        this.em = JpaUtil.getInstance().getEntityManager();
    }

    @Override
    public List<Driver> find() {
        return em.createQuery("SELECT d FROM Driver d", Driver.class).getResultList();
    }

    @Override
    public Driver findById(Integer id) {
        return null;
    }

    public List<DriverDto> findBySeason(Integer season) {
        TypedQuery<DriverDto> query = em.createQuery("""
                SELECT NEW com.a22rubenvp.formula1db.model.dto.DriverDto(d.forename,d.surname) 
                FROM Driver d, Result r 
                WHERE r.race.season.id = :season 
                AND r.driver.id = d.id""", DriverDto.class);
        query.setParameter("season", season);
        return query.getResultList();
    }

}
