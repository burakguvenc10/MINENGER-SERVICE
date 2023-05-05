package com.minenger.App.Service.Uye;

import com.minenger.App.Dto.Uye.UyeRequestDTO;
import com.minenger.App.Dto.Uye.response.UyeApiResponse;
import com.minenger.App.Entity.Uye.Uye;
import com.minenger.App.Repository.Uye.IUyeRepository;
import com.minenger.App.Repository.Uye.UyeRepository;
import com.minenger.App.Util.MessagingConstants;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;

@Service
public class UyeServices implements IUyeService {
    @Autowired
    private UyeRepository repository;

    @Autowired
    private IUyeRepository repositoryJpa;

    @Autowired
    private ModelMapper mapper;

    @Override
    public UyeApiResponse postSignup(UyeRequestDTO requestDTO) {
        UyeApiResponse uyeApiResponse;
        requestDTO.setKayitTarihi(new Timestamp(System.currentTimeMillis()));
        Uye uye = mapper.map(requestDTO,Uye.class);
        repository.signUp(uye);
        uyeApiResponse = new UyeApiResponse(MessagingConstants.SUCCESS_MESSAGE, uye);
        return uyeApiResponse;
    }

    public UyeApiResponse SignupUser(Long id){
        UyeApiResponse uyeApiResponse;
        Uye uye = repositoryJpa.findByUser(id);
        uyeApiResponse = new UyeApiResponse(MessagingConstants.SUCCESS_MESSAGE, uye);
        return uyeApiResponse;
    }

}
