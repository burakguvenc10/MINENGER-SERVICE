package com.minenger.App.Repository.Duyurular.impl;

import com.minenger.App.Entity.Duyurular.Duyuru;
import com.minenger.App.Repository.BaseRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class DuyurularRepository extends BaseRepository implements IDuyurularRepository {

    @Override
    public Duyuru getFindDuyuruList(){
        String hql = "SELECT " +
                "ID, " +
                "BASLIK, " +
                "ICERIK " +
                //"DUYURU_TARIH " +
                "FROM Duyurular ";

        Query query = entityManager.createNativeQuery(hql);
        Duyuru result = (Duyuru) query.getSingleResult();
        return result;

    }

}
