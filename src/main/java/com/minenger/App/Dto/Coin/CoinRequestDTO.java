package com.minenger.App.Dto.Coin;

import lombok.*;
import java.sql.Timestamp;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoinRequestDTO {

    private String coinAdi;

    private Double kazilanDeger;

    private Timestamp degisiklikTarihi;

}
