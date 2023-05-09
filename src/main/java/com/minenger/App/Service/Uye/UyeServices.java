package com.minenger.App.Service.Uye;

import com.minenger.App.Dto.Uye.UyeRequestDTO;
import com.minenger.App.Dto.Uye.response.ReferansKoduResponse;
import com.minenger.App.Dto.Uye.response.UyeApiResponse;
import com.minenger.App.Entity.Uye.User;
import com.minenger.App.Entity.Uye.Uye;
import com.minenger.App.Repository.Uye.IUyeRepository;
import com.minenger.App.Repository.Uye.UserRepository;
import com.minenger.App.Util.MessagingConstants;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;

@Service
public class UyeServices implements IUyeService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private IUyeRepository repositoryJpa;

    @Autowired
    private ModelMapper mapper;


    @Override
    public UyeApiResponse postSignup(UyeRequestDTO requestDTO) {
        UyeApiResponse uyeApiResponse;
        requestDTO.setKayitTarihi(new Timestamp(System.currentTimeMillis()));
        User dto = mapper.map(requestDTO,User.class);
        User user = repository.Save(dto);
        uyeApiResponse = new UyeApiResponse(MessagingConstants.SUCCESS_MESSAGE,user);
        return uyeApiResponse;
    }

    @Override
    public UyeApiResponse findByUser(Long id) {
        UyeApiResponse Response;
        Uye uye = repositoryJpa.findByUser(id);
        Response = new UyeApiResponse(MessagingConstants.SUCCESS_MESSAGE, uye);
        return Response;
    }

    @Override
    public ReferansKoduResponse findReferansKod(Long id) {
        ReferansKoduResponse Response;
        String referansKodu = repositoryJpa.findByUserReferansKod(id);
        Response = new ReferansKoduResponse(MessagingConstants.SUCCESS_MESSAGE, referansKodu);
        return Response;
    }


}
