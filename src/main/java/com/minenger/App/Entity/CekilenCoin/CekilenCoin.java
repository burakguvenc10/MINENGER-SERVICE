package com.minenger.App.Entity.CekilenCoin;
import com.minenger.App.Entity.BaseEntity;
import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "CEKILENCOIN")
public class CekilenCoin extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "COIN_ADI")
    private String coinAdi;

    @Column(name = "CEKILEN_COIN")
    private int cekilenCoin;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "KULLANICI_ADI")
    private String kullaniciAdi;

    @Column(name = "KAYIT_TARIH")
    private Timestamp kayitTarih;

}
