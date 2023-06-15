package com.minenger.App.Service.Coin;

import com.minenger.App.Dto.Coin.CoinApiResponse;
import com.minenger.App.Dto.Coin.CoinRequestDTO;
import com.minenger.App.Entity.Coin.Coin;

public interface ICoinService {
    Coin postKazilanCoin(CoinRequestDTO requestDTO);

    CoinApiResponse findByCoin(Long id);

}
