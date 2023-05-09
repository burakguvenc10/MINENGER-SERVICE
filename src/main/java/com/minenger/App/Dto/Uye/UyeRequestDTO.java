package com.minenger.App.Dto.Uye;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.annotation.PropertyKey;
import java.sql.Timestamp;

@Data
@Getter
@Setter
@AllArgsConstructor
public class UyeRequestDTO {

    @JsonProperty("adi")
    private String adi;

    @JsonProperty("email")
    private String email;

    @JsonProperty("sifre")
    private String sifre;

    @JsonProperty("tel")
    private String tel;

    @JsonProperty("referanskodu")
    private String referanskodu;

    @JsonProperty("kayitTarihi")
    private Timestamp kayitTarihi;

}
