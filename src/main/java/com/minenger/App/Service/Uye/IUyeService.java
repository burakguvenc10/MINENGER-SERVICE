package com.minenger.App.Service.Uye;

import com.minenger.App.Dto.Uye.*;
import com.minenger.App.Entity.Uye.User;

public interface IUyeService {

    User Signup(UyeRequestDTO requestDTO);

    LoginApiResponse Login(LoginRequestDTO requestDTO);

    UyeApiResponse findByUser(Long id);

    UyeApiResponse findByUserMail(String mail);

    ReferansKoduResponse findReferansKod(Long id);

    User updatePassword(UpdatePasswordRequestDTO updatePasswordRequestDTO);
}
