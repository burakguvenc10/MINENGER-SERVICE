package com.minenger.App.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class BaseRepository {

    @PersistenceContext
    public EntityManager entityManager;

    public BaseRepository(){

    }

    public BaseRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

}
