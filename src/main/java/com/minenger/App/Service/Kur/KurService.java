package com.minenger.App.Service.Kur;

import com.minenger.App.Dto.Kur.KurApiResponse;
import com.minenger.App.Entity.Kur.Kur;
import com.minenger.App.Repository.Kur.IKurRepository;
import com.minenger.App.Util.MessagingConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KurService implements IKurService{

    @Autowired
    private IKurRepository kurRepositoryJPA;

    @Override
    public KurApiResponse findCoinKur(Long id) {
        KurApiResponse Response;
        Kur kur = kurRepositoryJPA.findByCoin(id);
        Response = new KurApiResponse(MessagingConstants.SUCCESS_MESSAGE, kur);
        return Response;
    }
}
