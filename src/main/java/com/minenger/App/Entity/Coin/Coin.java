package com.minenger.App.Entity.Coin;

import com.minenger.App.Entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "COIN", schema = "MINENGER")
public class Coin extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "COIN_ADI")
    private String coinAdi;

    @Column(name = "KAZILAN_DEGER")
    private String kazilanDeger;

    @Column(name = "DEGISIKLIK_TARIH")
    private Timestamp degisiklikTarihi;

}