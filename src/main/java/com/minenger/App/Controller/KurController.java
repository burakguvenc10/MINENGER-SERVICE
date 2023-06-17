package com.minenger.App.Controller;

import com.minenger.App.Dto.Kur.KurApiResponse;
import com.minenger.App.Service.Kur.IKurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(value = "/kur")
public class KurController {
    @Autowired
    private IKurService kurService;

    @GetMapping(value = "/findCoin")
    public ResponseEntity<KurApiResponse> findKur(@RequestParam Long id){
        KurApiResponse responseDTO = this.kurService.findCoinKur(id);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping(value = "/findCoinByName")
    public ResponseEntity<KurApiResponse> findKurByName(@RequestParam String coinAdi){
        KurApiResponse responseDTO = this.kurService.findCoinKurByName(coinAdi);
        return ResponseEntity.ok(responseDTO);
    }

}
