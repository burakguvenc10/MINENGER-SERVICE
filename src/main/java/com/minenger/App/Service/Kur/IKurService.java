package com.minenger.App.Service.Kur;

import com.minenger.App.Dto.Kur.KurApiResponse;

public interface IKurService {

    KurApiResponse findCoinKur(Long id);

    KurApiResponse findCoinKurByName(String coinAdi);
}
