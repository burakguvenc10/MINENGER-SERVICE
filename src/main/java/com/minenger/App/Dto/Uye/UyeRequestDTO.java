package com.minenger.App.Dto.Uye;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UyeRequestDTO {

    private String adi;

    private String email;

    private String sifre;

    private int tel;

    private String referanskodu;

    private Timestamp kayitTarihi;

}
