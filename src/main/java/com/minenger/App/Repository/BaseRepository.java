package com.minenger.App.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public abstract class BaseRepository {

    @PersistenceContext
    public EntityManager entityManager;

    public BaseRepository(){

    }

    public BaseRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

}
