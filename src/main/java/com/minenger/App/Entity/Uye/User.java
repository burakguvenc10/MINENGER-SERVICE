package com.minenger.App.Entity.Uye;

import com.minenger.App.Entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "UYE")
public class User extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "KULLANICI_ADI", unique = true)
    private String adi;

    @Column(name = "EMAIL", unique = true)
    private String email;

    @Column(name = "SIFRE")
    private String sifre;

    @Column(name = "CEP_TEL", unique = true)
    private String tel;

    @Column(name = "REFERANS_KOD", unique = true)
    private String referanskodu;

    @Column(name = "KAYIT_TARIH")
    private Timestamp kayitTarihi;

    @Column(name = "GUNCELLEME_TARIH")
    private Timestamp guncellemeTarihi;

}