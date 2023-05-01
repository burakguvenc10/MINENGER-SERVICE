package com.minenger.App.Entity.Duyurular;

import com.minenger.App.Entity.BaseEntity;
import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "Duyurular")
public class Duyuru extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "BASLIK")
    private String baslik;

    @Column(name = "ICERIK")
    private String icerik;

    /*@Column(name = "DUYURU_TARIH")
    private Timestamp duyuruTarihi;*/

}
