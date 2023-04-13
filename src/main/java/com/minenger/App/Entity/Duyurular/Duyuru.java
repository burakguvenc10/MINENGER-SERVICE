package com.minenger.App.Entity.Duyurular;

import com.minenger.App.Entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "Duyurular")
public class Duyuru extends BaseEntity implements Serializable {

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
