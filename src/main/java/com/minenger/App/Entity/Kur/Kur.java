package com.minenger.App.Entity.Kur;
import com.minenger.App.Entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "KUR", schema = "MINENGER")
public class Kur extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "COIN_ADI")
    private String coinAdi;

    @Column(name = "ORAN")
    private String oran;

    @Column(name = "DEGISIKLIK_TARIH")
    private Timestamp degisiklikTarihi;

}
