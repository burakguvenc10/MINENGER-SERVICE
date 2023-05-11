package com.minenger.App.Dto.Coin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoinRequestDTO {

    private Long id;

    private String coinAdi;

    private Double kazilanDeger;

    private Timestamp degisiklikTarihi;

}
