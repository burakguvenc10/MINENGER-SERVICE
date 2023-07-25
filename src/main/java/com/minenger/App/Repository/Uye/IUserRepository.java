package com.minenger.App.Repository.Uye;

import com.minenger.App.Entity.Uye.User;
import com.minenger.App.Entity.Uye.Uye;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends CrudRepository<User, Long> {

    @Query(value = "SELECT ID, KULLANICI_ADI, EMAIL, SIFRE, CEP_TEL, REFERANS_KOD, KAYIT_TARIH, GUNCELLEME_TARIH " +
            "FROM UYE WHERE EMAIL = :Mail ", nativeQuery = true)
    User findByEmail(@Param("Mail") String mail);

}
