package com.minenger.App.Service.Coin;

import com.minenger.App.Dto.Coin.CoinApiResponse;
import com.minenger.App.Dto.Coin.CoinRequestDTO;

public interface ICoinService {
    CoinApiResponse postKazilanCoin(CoinRequestDTO requestDTO);

    CoinApiResponse findByCoin(Long id);

}
