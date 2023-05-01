package com.minenger.App.Repository.Duyurular;

import  com.minenger.App.Entity.Duyurular.Duyuru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IDuyurularJpaRepository extends JpaRepository<Duyuru,Integer> {

    @Query(value = "SELECT ID, BASLIK, ICERIK FROM Duyurular d", nativeQuery = true)
    List<Duyuru> findByDuyuruList();







}
