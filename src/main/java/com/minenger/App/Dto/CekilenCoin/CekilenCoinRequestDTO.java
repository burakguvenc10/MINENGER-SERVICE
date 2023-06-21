package com.minenger.App.Dto.CekilenCoin;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CekilenCoinRequestDTO {

    private String coinAdi;

    private String cekilen_Coin;

    private String email;

    private String kullaniciAdi;

    private Timestamp kayitTarih;

}
