package com.minenger.App.Entity.Uye;

import com.minenger.App.Entity.BaseEntity;
import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "UYE")
public class Uye extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "KULLANICI_ADI",unique=true)
    private String adi;

    @Column(name = "EMAIL",unique=true)
    private String email;

}
