package com.a22rubenvp.formula1db.model.dao;

import com.a22rubenvp.formula1db.model.JpaUtil;
import com.a22rubenvp.formula1db.model.dto.LapTimeDto;
import com.a22rubenvp.formula1db.model.entities.LapTime;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class LapTimeDao implements IDao<LapTime> {
    EntityManager em;

    public LapTimeDao() {
        this.em = JpaUtil.getInstance().getEntityManager();
    }

    @Override
    public List<LapTime> find() {
        return em.createQuery("SELECT lt FROM LapTime lt", LapTime.class).getResultList();
    }

    @Override
    public LapTime findById(Integer id) {
        return null;
    }

    public List<LapTimeDto> findByDRS(String driver, String race, Integer season) {
        Query qRaceId = em.createQuery("SELECT r.id FROM Race r WHERE r.season.id = :season AND r.name = :circuit");
        qRaceId.setParameter("season", season);
        qRaceId.setParameter("circuit", race);
        Integer raceId = (Integer) qRaceId.getSingleResult();
        System.out.println("RACE ID: " + raceId);
        TypedQuery<LapTimeDto> query = em.createQuery("""
                SELECT NEW com.a22rubenvp.formula1db.model.dto.LapTimeDto(lt.id.lap,lt.milliseconds)
                FROM LapTime lt
                WHERE lt.race.id = :raceId
                AND lt.driver.forename = :driver""", LapTimeDto.class);
        query.setParameter("driver", driver);
        query.setParameter("raceId", raceId);
        return query.getResultList();
    }
}
