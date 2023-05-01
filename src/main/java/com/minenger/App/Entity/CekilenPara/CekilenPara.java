package com.minenger.App.Entity.CekilenPara;
import com.minenger.App.Entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "CEKILENPARA", schema = "MINENGER")
public class CekilenPara extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "COIN_ADI")
    private String coinAdi;

    @Column(name = "CEKILEN_DEGER")
    private int cekilenDeger;

    @Column(name = "KULLANICI_ADI")
    private String adi;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "HESAP_NO")
    private String hesapNo;

    @Column(name = "DEGISIKLIK_TARIH")
    private Timestamp degisiklikTarihi;

}
