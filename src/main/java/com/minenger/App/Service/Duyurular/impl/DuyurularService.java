package com.minenger.App.Service.Duyurular.impl;

import com.minenger.App.Dto.Duyurular.DuyurularRequestDTO;
import com.minenger.App.Dto.Duyurular.response.GetDuyurularApiResponse;
import com.minenger.App.Entity.Duyurular.Duyuru;
import com.minenger.App.Repository.Duyurular.jpaRepositories.DuyurularJpaRepository;
import com.minenger.App.Util.MessagingConstants;
import com.minenger.App.Repository.Duyurular.impl.IDuyurularRepository;
import com.minenger.App.Service.Duyurular.IDuyurularService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class DuyurularService implements IDuyurularService {

    //private final ModelMapper modelMapper;
    private IDuyurularRepository duyurularRepository;
    private DuyurularJpaRepository duyurularJPARepository;

    public DuyurularService(IDuyurularRepository duyurularRepository,
                            DuyurularJpaRepository duyurularJPARepository) {
        this.duyurularRepository = duyurularRepository;
        this.duyurularJPARepository = duyurularJPARepository;
    }


    @Override
    public GetDuyurularApiResponse getDuyuru(DuyurularRequestDTO duyurularRequestDTO) {
        GetDuyurularApiResponse getDuyurularApiResponse;

        Duyuru data = duyurularRepository.getFindDuyuruList();

        getDuyurularApiResponse = new GetDuyurularApiResponse(MessagingConstants.SUCCESS_MESSAGE,data);
        return getDuyurularApiResponse;
    }
    @Override
    public GetDuyurularApiResponse postDuyurular(DuyurularRequestDTO requestDTO) {
        GetDuyurularApiResponse getDuyurularApiResponse = null;

        Duyuru data = duyurularJPARepository.postDuyurularJpa(requestDTO);
        getDuyurularApiResponse.setData(data);
        getDuyurularApiResponse = new GetDuyurularApiResponse(MessagingConstants.SUCCESS_MESSAGE,data);

        return getDuyurularApiResponse;

    }
}
