package com.minenger.App.Repository.Kur;

import com.minenger.App.Entity.Kur.Kur;
import com.minenger.App.Entity.Uye.Uye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IKurRepository extends JpaRepository<Kur, Long> {

    @Query(value = "SELECT ID, COIN_ADI, ORAN " +
            "FROM KUR WHERE ID = :Id ", nativeQuery = true)
    Kur findByCoin(@Param("Id") Long id);

    @Query(value = "SELECT ID, COIN_ADI, ORAN " +
            "FROM KUR WHERE COIN_ADI = :coinName ", nativeQuery = true)
    Kur findCoinByName(@Param("coinName") String coinAdi);
}
