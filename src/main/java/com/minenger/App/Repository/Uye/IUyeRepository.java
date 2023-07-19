package com.minenger.App.Repository.Uye;

import com.minenger.App.Entity.Uye.Uye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUyeRepository extends JpaRepository<Uye, Long> {

    @Query(value = "SELECT ID, KULLANICI_ADI, EMAIL " +
            "FROM UYE WHERE ID = :Id ", nativeQuery = true)
    Uye findByUser(@Param("Id") Long id);

    @Query(value = "SELECT ID, KULLANICI_ADI, EMAIL " +
            "FROM UYE WHERE EMAIL = :Mail ", nativeQuery = true)
    Uye findByEmail(@Param("Mail") String mail);

    @Query(value = "SELECT REFERANS_KOD " +
            "FROM UYE WHERE ID = :Id ", nativeQuery = true)
    String findByUserReferansKod(@Param("Id") Long id);

}
