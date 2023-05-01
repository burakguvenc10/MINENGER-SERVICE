package com.minenger.App.Service.Duyurular;

import com.minenger.App.Dto.Duyurular.DuyurularRequestDTO;
import com.minenger.App.Dto.Duyurular.response.GetDuyurularApiResponse;
import com.minenger.App.Entity.Duyurular.Duyuru;
import com.minenger.App.Repository.Duyurular.IDuyurularJpaRepository;
import com.minenger.App.Util.MessagingConstants;
import com.minenger.App.Service.Duyurular.IDuyurularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuyurularService implements IDuyurularService {

    //private final ModelMapper modelMapper;
    @Autowired
    private IDuyurularJpaRepository duyurularRepository;

    @Override
    public GetDuyurularApiResponse getDuyuru(DuyurularRequestDTO duyurularRequestDTO) {
        GetDuyurularApiResponse getDuyurularApiResponse;
        List<Duyuru> data = duyurularRepository.findByDuyuruList();

        getDuyurularApiResponse = new GetDuyurularApiResponse(MessagingConstants.SUCCESS_MESSAGE,data);
        return getDuyurularApiResponse;
    }
    @Override
    public GetDuyurularApiResponse postDuyurular(DuyurularRequestDTO requestDTO) {
        GetDuyurularApiResponse getDuyurularApiResponse = null;
        /*Duyuru duyuru = new Duyuru();
        duyuru.setId(requestDTO.getId());
        duyuru.setBaslik(requestDTO.getBaslik());
        duyuru.setIcerik(requestDTO.getIcerik());
        Duyuru data = duyurularRepository.save(duyuru);
        getDuyurularApiResponse.setData(data);
        getDuyurularApiResponse = new GetDuyurularApiResponse(MessagingConstants.SUCCESS_MESSAGE,data);*/

        return getDuyurularApiResponse;

    }
}
