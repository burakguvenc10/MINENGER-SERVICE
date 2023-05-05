package com.minenger.App.Repository.Uye;

import com.minenger.App.Entity.Uye.Uye;
import com.minenger.App.Repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UyeRepository extends BaseRepository {

    @Autowired
    private IUyeRepository repository;

    public Uye signUp(Uye uye) {
        return repository.save(uye);
    }




}
