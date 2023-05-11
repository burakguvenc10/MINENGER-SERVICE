package com.minenger.App.Entity.Coin;

import com.minenger.App.Entity.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "COIN")
public class Coin extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "COIN_ADI")
    private String coinAdi;

    @Column(name = "KAZILAN_DEGER")
    private Double kazilanDeger;

    @Column(name = "DEGISIKLIK_TARIH")
    private Timestamp degisiklikTarihi;

}