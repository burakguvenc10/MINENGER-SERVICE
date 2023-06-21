package com.minenger.App.Repository.Coin;

import com.minenger.App.Entity.Coin.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoinRepository extends JpaRepository<Coin,Long> {

    @Query(value = "SELECT ID, COIN_ADI, KAZILAN_DEGER, DEGISIKLIK_TARIH " +
            "FROM COIN WHERE ID = :Id ", nativeQuery = true)
    Coin findByCoin(@Param("Id") Long id);

    @Query(value = "SELECT ID, COIN_ADI, KAZILAN_DEGER, DEGISIKLIK_TARIH " +
            "FROM COIN WHERE COIN_ADI = :coin ", nativeQuery = true)
    Coin findByCoinName(@Param("coin") String coinName);

}
