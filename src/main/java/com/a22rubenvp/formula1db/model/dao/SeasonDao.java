package com.a22rubenvp.formula1db.model.dao;

import com.a22rubenvp.formula1db.model.JpaUtil;
import com.a22rubenvp.formula1db.model.dto.SeasonDto;
import com.a22rubenvp.formula1db.model.entities.Season;
import jakarta.persistence.EntityManager;

import java.util.List;

public class SeasonDao implements IDao<Season> {
    EntityManager em;

    public SeasonDao() {
        this.em = JpaUtil.getInstance().getEntityManager();
    }

    @Override
    public List<Season> find() {
        return em.createQuery("SELECT NEW com.a22rubenvp.formula1db.model.dto.SeasonDto(s.id) FROM Season s").getResultList();
    }

    @Override
    public Season findById(Integer id) {
        return em.find(Season.class, id);
    }

    public List<SeasonDto> findAll() {
        return em.createQuery("SELECT NEW com.a22rubenvp.formula1db.model.dto.SeasonDto(s.id) FROM Season s").getResultList();
    }
}
