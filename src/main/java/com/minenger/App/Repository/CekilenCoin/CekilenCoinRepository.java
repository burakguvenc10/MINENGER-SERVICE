package com.minenger.App.Repository.CekilenCoin;

import com.minenger.App.Entity.CekilenCoin.CekilenCoin;
import com.minenger.App.Repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CekilenCoinRepository extends BaseRepository {
    @Autowired
    ICekilenCoinRepository repository;

    @Transactional
    public CekilenCoin saveCekCoin(CekilenCoin cekDto) {
        return repository.save(cekDto);
    }

}
