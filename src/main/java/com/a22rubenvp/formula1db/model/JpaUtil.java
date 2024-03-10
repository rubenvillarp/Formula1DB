package com.a22rubenvp.formula1db.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private final static String PERSISTENCE_UNIT_NAME = "formula1db";
    private static EntityManagerFactory emf;
    private static JpaUtil instance;

    private JpaUtil(){
        emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    public static JpaUtil getInstance(){
        if(instance == null){
            synchronized (JpaUtil.class){
                if(instance == null){
                    instance = new JpaUtil();
                }
            }
        }
        return instance;
    }

    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}