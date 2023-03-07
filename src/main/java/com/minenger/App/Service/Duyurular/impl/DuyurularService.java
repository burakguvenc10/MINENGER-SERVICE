package com.minenger.App.Service.Duyurular.impl;

import com.minenger.App.Dto.Duyurular.DuyurularRequestDTO;
import com.minenger.App.Dto.Duyurular.response.GetDuyurularApiResponse;
import com.minenger.App.Service.Duyurular.IDuyurularService;
import org.springframework.stereotype.Service;

@Service
public class DuyurularService implements IDuyurularService {

    //private final ModelMapper modelMapper;



    @Override
    public void insertDuyuru(DuyurularRequestDTO requestDTO) {

    }

    @Override
    public GetDuyurularApiResponse getDuyuru(DuyurularRequestDTO requestDTO) {
        GetDuyurularApiResponse getDuyurularApiResponse;
        getDuyurularApiResponse = null;


        return getDuyurularApiResponse;
    }
}
