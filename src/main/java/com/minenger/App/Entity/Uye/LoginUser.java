package com.minenger.App.Entity.Uye;

import com.minenger.App.Entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Entity
@Data
@Table(name = "UYE")
public class LoginUser extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "EMAIL", unique = true)
    private String email;

    @Column(name = "SIFRE")
    private String sifre;

}
