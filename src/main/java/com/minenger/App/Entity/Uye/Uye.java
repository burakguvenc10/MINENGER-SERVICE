package com.minenger.App.Entity.Uye;

import com.minenger.App.Entity.BaseEntity;
import lombok.Data;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "UYE")
public class Uye extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "KULLANICI_ADI")
    private String adi;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "SIFRE")
    private String sifre;

    @Column(name = "CEP_TEL")
    private String tel;

    @Column(name = "REFERANS_KOD")
    private String referanskodu;

    @Column(name = "KAYIT_TARIH")
    private Timestamp kayitTarihi;

}
