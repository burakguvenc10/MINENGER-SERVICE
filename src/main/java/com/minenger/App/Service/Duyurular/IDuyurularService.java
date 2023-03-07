package com.minenger.App.Service.Duyurular;

import com.minenger.App.Dto.Duyurular.DuyurularRequestDTO;
import com.minenger.App.Dto.Duyurular.response.GetDuyurularApiResponse;

public interface IDuyurularService {

    void insertDuyuru(DuyurularRequestDTO requestDTO);

    GetDuyurularApiResponse getDuyuru(DuyurularRequestDTO requestDTO);
}
