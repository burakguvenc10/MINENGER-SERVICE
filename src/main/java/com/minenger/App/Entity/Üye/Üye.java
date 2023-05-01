package com.minenger.App.Entity.Üye;

import com.minenger.App.Entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "UYE", schema = "MINENGER")
public class Üye extends BaseEntity implements Serializable {

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
    private int tel;

    @Column(name = "REFERANS_KOD")
    private int referanskodu;

    @Column(name = "KAYIT_TARIH")
    private Timestamp kayitTarihi;

}
