package com.minenger.App.Service.Uye;

import com.minenger.App.Dto.Uye.UyeRequestDTO;
import com.minenger.App.Dto.Uye.response.ReferansKoduResponse;
import com.minenger.App.Dto.Uye.response.UyeApiResponse;

public interface IUyeService {

    UyeApiResponse postSignup(UyeRequestDTO requestDTO);

    UyeApiResponse findByUser(Long id);

    ReferansKoduResponse findReferansKod(Long id);
}
