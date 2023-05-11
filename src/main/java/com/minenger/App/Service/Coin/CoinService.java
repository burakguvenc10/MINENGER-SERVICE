package com.minenger.App.Service.Coin;

import com.minenger.App.Dto.Coin.CoinApiResponse;
import com.minenger.App.Dto.Coin.CoinRequestDTO;
import com.minenger.App.Entity.Coin.Coin;
import com.minenger.App.Repository.Coin.ICoinRepository;
import com.minenger.App.Util.MessagingConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoinService implements ICoinService{

    @Autowired
    private ICoinRepository coinRepository;


    @Override
    public CoinApiResponse postKazilanCoin(CoinRequestDTO requestDTO) {
        return null;
    }

    @Override
    public CoinApiResponse findByCoin(Long id) {
        CoinApiResponse Response;
        Coin coin = coinRepository.findByCoin(id);
        Response = new CoinApiResponse(MessagingConstants.SUCCESS_MESSAGE, coin);
        return Response;
    }
}
