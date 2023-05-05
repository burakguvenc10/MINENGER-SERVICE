package com.minenger.App.Repository.Uye;

import com.minenger.App.Entity.Uye.Uye;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUyeRepository extends JpaRepository<Uye, Long> {

    @Query(value = "SELECT ID, KULLANICI_ADI, EMAIL, SIFRE, CEP_TEL, REFERANS_KOD, KAYIT_TARIH " +
            "FROM UYE WHERE ID = :Id ", nativeQuery = true)
    Uye findByUser(@Param("Id") Long id);
}
