package com.minenger.App.Service.CekilenCoin;

import com.minenger.App.Dto.CekilenCoin.CekilenCoinRequestDTO;
import com.minenger.App.Entity.CekilenCoin.CekilenCoin;

public interface ICekilenCoinService {
    CekilenCoin cekCoin(CekilenCoinRequestDTO requestDTO);

}
