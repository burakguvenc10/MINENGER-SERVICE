package com.minenger.App.Service.Uye;

import com.minenger.App.Dto.Uye.*;
import com.minenger.App.Entity.Uye.LoginUser;
import com.minenger.App.Entity.Uye.User;
import com.minenger.App.Entity.Uye.Uye;

public interface IUyeService {

    User Signup(UyeRequestDTO requestDTO);

    LoginApiResponse Login(LoginRequestDTO requestDTO);

    UyeApiResponse findByUser(Long id);

    ReferansKoduResponse findReferansKod(Long id);
}
