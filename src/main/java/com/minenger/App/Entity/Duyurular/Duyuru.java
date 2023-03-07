package com.minenger.App.Entity.Duyurular;

import com.minenger.App.Entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "DUYURULAR", schema = "MINENGER")
public class Duyuru extends BaseEntity implements Serializable {

    @Id
    @Column(name = "BASLIK")
    private String baslik;

    @Column(name = "ICERIK")
    private String icerik;

}
