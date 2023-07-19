package com.minenger.App.Service.Coin;

import com.minenger.App.Dto.Coin.CoinApiResponse;
import com.minenger.App.Dto.Coin.CoinRequestDTO;
import com.minenger.App.Entity.Coin.Coin;
import com.minenger.App.Repository.Coin.CoinRepository;
import com.minenger.App.Repository.Coin.ICoinRepository;
import com.minenger.App.Util.MessagingConstants;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class CoinService implements ICoinService{

    @Autowired
    private ICoinRepository coinRepositoryJpa;
    @Autowired
    private CoinRepository coinRepository;
    @Autowired
    private ModelMapper mapper;

    @Override
    public Coin postKazilanCoin(CoinRequestDTO requestDTO) {
        requestDTO.setDegisiklikTarihi(new Timestamp(System.currentTimeMillis()));
        Coin userDto = mapper.map(requestDTO,Coin.class);
        Coin kazilanCoin = coinRepository.saveKazilanCoin(userDto);
        return kazilanCoin;
    }

    @Override
    public CoinApiResponse findByCoin(Long id) {
        CoinApiResponse Response;
        Coin coin = coinRepositoryJpa.findByCoin(id);
        Response = new CoinApiResponse(MessagingConstants.SUCCESS_MESSAGE, coin);
        return Response;
    }

    @Override
    public CoinApiResponse findByCoinName(String coinName) {
        CoinApiResponse Response;
        Coin coin = coinRepositoryJpa.findByCoinName(coinName);
        Response = new CoinApiResponse(MessagingConstants.SUCCESS_MESSAGE, coin);
        return Response;
    }
}
