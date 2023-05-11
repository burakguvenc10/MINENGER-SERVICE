package com.minenger.App.Repository.Coin;

import com.minenger.App.Entity.Coin.Coin;
import com.minenger.App.Repository.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CoinRepository  extends BaseRepository {

    @Autowired
    private ICoinRepository repository;

    @Transactional
    public Coin SavekazilanCoin(Coin coinDto) {
        return repository.save(coinDto);
    }
}
