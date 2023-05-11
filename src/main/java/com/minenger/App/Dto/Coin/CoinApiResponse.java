package com.minenger.App.Dto.Coin;

import com.minenger.App.Dto.BaseApiResponseDTO;
import com.minenger.App.Entity.Coin.Coin;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoinApiResponse extends BaseApiResponseDTO {

    private Coin coin;

    public CoinApiResponse(String message, Coin coin) {
        super(message);
        this.coin = coin;
    }
}
