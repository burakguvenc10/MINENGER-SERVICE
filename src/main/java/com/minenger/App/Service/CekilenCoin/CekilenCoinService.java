package com.minenger.App.Service.CekilenCoin;

import com.minenger.App.Dto.CekilenCoin.CekilenCoinRequestDTO;
import com.minenger.App.Entity.CekilenCoin.CekilenCoin;
import com.minenger.App.Entity.Coin.Coin;
import com.minenger.App.Repository.CekilenCoin.CekilenCoinRepository;
import com.minenger.App.Repository.CekilenCoin.ICekilenCoinRepository;
import com.minenger.App.Repository.Coin.CoinRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
@Service
public class CekilenCoinService implements ICekilenCoinService{
    @Autowired
    CekilenCoinRepository cekilenCoinRepository;
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private CoinRepository coinRepository;

    @Override
    public CekilenCoin cekCoin(CekilenCoinRequestDTO requestDTO) {
        requestDTO.setKayitTarih(new Timestamp(System.currentTimeMillis()));
        CekilenCoin cek_coinDto = mapper.map(requestDTO,CekilenCoin.class);
        CekilenCoin cekilenCoin = cekilenCoinRepository.saveCekCoin(cek_coinDto);
        Coin coin = coinRepository.getKazilanCoin(requestDTO.getCoinAdi());
        coin.setKazilanDeger(0.0);
        coin.setDegisiklikTarihi(new Timestamp(System.currentTimeMillis()));
        coinRepository.saveKazilanCoin(coin);
        return cekilenCoin;
    }

}
