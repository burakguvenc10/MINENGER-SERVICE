package com.minenger.App.Repository.Coin;

import com.minenger.App.Entity.Coin.Coin;
import com.minenger.App.Repository.BaseRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CoinRepository extends BaseRepository {

    @Autowired
    private ICoinRepository repository;

    @Transactional
    public Coin saveKazilanCoin(Coin coinDto) {
        return repository.save(coinDto);
    }

    public Coin getKazilanCoin(String coinAdi) {
        return repository.findByCoinName(coinAdi);
    }

}
