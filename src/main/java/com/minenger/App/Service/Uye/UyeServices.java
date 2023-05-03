package com.minenger.App.Service.Uye;

import com.minenger.App.Dto.Uye.UyeRequestDTO;
import com.minenger.App.Dto.Uye.response.UyeApiResponse;
import com.minenger.App.Entity.Uye.Uye;
import com.minenger.App.Repository.Uye.IUyeRepository;
import com.minenger.App.Repository.Uye.UyeRepository;
import com.minenger.App.Util.MessagingConstants;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;

@Service
public class UyeServices implements IUyeService {

    @Autowired
    private UyeRepository repository;

    @Override
    public UyeApiResponse postSignup(UyeRequestDTO requestDTO) {
        UyeApiResponse uyeApiResponse = null;
        Uye uye = new Uye();
        uye.setAdi(requestDTO.getAdi());
        uye.setEmail(requestDTO.getEmail());
        uye.setSifre(requestDTO.getSifre());
        uye.setTel(requestDTO.getTel());
        uye.setReferanskodu(requestDTO.getReferanskodu());
        uye.setKayitTarihi(new Timestamp(System.currentTimeMillis()));
        repository.signUp(uye);
        uyeApiResponse = new UyeApiResponse(MessagingConstants.SUCCESS_MESSAGE, uye);
        return uyeApiResponse;
    }
}
