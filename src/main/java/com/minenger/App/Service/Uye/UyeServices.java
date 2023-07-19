package com.minenger.App.Service.Uye;

import com.minenger.App.Dto.Uye.*;
import com.minenger.App.Entity.Uye.LoginUser;
import com.minenger.App.Entity.Uye.User;
import com.minenger.App.Entity.Uye.Uye;
import com.minenger.App.Repository.Uye.IUyeRepository;
import com.minenger.App.Repository.Uye.UserRepository;
import com.minenger.App.Util.MessagingConstants;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public User Signup(UyeRequestDTO requestDTO) {
        requestDTO.setKayitTarihi(new Timestamp(System.currentTimeMillis()));
        User userDto = mapper.map(requestDTO,User.class);
        User user = repository.Save(userDto);
        return user;
    }

    @Override
    public LoginApiResponse Login(LoginRequestDTO requestDTO) {
        Uye uye = repositoryJpa.findByUser(requestDTO.getId());
        if (uye.getEmail().toString() != requestDTO.getEmail().toString()){
            LoginUser user = repository.Login();
            return new LoginApiResponse(MessagingConstants.SUCCESS_MESSAGE,user);
        }
        else{
            return new LoginApiResponse(MessagingConstants.ERROR_LOGIN);
        }
    }

    @Override
    public UyeApiResponse findByUser(Long id) {
        UyeApiResponse Response;
        Uye uye = repositoryJpa.findByUser(id);
        Response = new UyeApiResponse(MessagingConstants.SUCCESS_MESSAGE, uye);
        return Response;
    }
    @Override
    public UyeApiResponse findByUserMail(String mail) {
        UyeApiResponse Response;
        Uye uye = repositoryJpa.findByEmail(mail);
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
