package com.a22rubenvp.formula1db.model.dao;

import com.a22rubenvp.formula1db.model.JpaUtil;
import com.a22rubenvp.formula1db.model.dto.RaceDto;
import com.a22rubenvp.formula1db.model.entities.Race;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class RaceDao implements IDao<Race> {
    EntityManager em;

    public RaceDao() {
        this.em = JpaUtil.getInstance().getEntityManager();
    }

    @Override
    public List<Race> find() {
        return em.createQuery("SELECT r FROM Race r", Race.class).getResultList();
    }

    @Override
    public Race findById(Integer id) {
        return em.find(Race.class, id);
    }

    public List<RaceDto> findByYear(Integer year) {
        TypedQuery<RaceDto> query = em.createQuery("SELECT NEW com.a22rubenvp.formula1db.model.dto.RaceDto(r.name) FROM Race r WHERE r.season.id = :year", RaceDto.class);
        query.setParameter("year", year);
        return query.getResultList();
    }
}
