package com.minenger.App.Service.Duyurular;

import com.minenger.App.Dto.Duyurular.DuyurularApiResponse;
import com.minenger.App.Entity.Duyurular.Duyuru;
import com.minenger.App.Repository.Duyurular.IDuyurularJpaRepository;
import com.minenger.App.Util.MessagingConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuyurularService implements IDuyurularService {

    //private final ModelMapper modelMapper;
    @Autowired
    private IDuyurularJpaRepository duyurularRepository;

    @Override
    public DuyurularApiResponse getDuyuru() {
        DuyurularApiResponse duyurularApiResponse;
        List<Duyuru> data = duyurularRepository.findByDuyuruList(PageRequest.of(0, 10));

        duyurularApiResponse = new DuyurularApiResponse(MessagingConstants.SUCCESS_MESSAGE,data);
        return duyurularApiResponse;
    }

}
