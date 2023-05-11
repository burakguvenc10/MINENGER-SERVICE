package com.minenger.App.Dto.Uye;

import lombok.*;
import java.sql.Timestamp;

@Data
@Getter
@Setter
@AllArgsConstructor
public class UyeRequestDTO{

    private String adi;

    private String email;

    private String sifre;

    private String tel;

    private String referanskodu;

    private Timestamp kayitTarihi;

}
