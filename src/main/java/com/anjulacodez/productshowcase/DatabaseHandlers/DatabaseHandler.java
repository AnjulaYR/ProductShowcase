package com.anjulacodez.productshowcase.DatabaseHandlers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseHandler {
    private EntityManager entityManager;

    public DatabaseHandler(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("openjpa_unit");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public EntityManager getEM(){
        return entityManager;
    }
}
