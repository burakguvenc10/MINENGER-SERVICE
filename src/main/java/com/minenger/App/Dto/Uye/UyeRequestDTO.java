package com.minenger.App.Dto.Uye;

import lombok.*;

import javax.annotation.PropertyKey;
import java.sql.Timestamp;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UyeRequestDTO {

    private String adi;

    private String email;

    private String sifre;

    private String tel;

    private String referanskodu;

    private Timestamp kayitTarihi;

}
