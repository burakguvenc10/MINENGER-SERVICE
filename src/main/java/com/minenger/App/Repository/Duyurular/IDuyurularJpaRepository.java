package com.minenger.App.Repository.Duyurular;

import  com.minenger.App.Entity.Duyurular.Duyuru;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IDuyurularJpaRepository extends JpaRepository<Duyuru,Long> {

    @Query(value = "SELECT ID, BASLIK, ICERIK, DUYURU_TARIH FROM Duyurular d ORDER BY d.id DESC ", nativeQuery = true)
    List<Duyuru> findByDuyuruList(Pageable pageable);



}
