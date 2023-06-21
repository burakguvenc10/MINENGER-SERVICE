package com.minenger.App.Controller;

import com.minenger.App.Dto.CekilenCoin.CekilenCoinRequestDTO;
import com.minenger.App.Dto.Uye.UyeRequestDTO;
import com.minenger.App.Entity.CekilenCoin.CekilenCoin;
import com.minenger.App.Entity.Uye.User;
import com.minenger.App.Service.CekilenCoin.ICekilenCoinService;
import com.minenger.App.Service.Uye.IUyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cekilenCoin")
public class CekilenCoinController {

    @Autowired
    private ICekilenCoinService cekilenCoinService;

    @PostMapping(value = "/transfer")
    public ResponseEntity<CekilenCoin> Signup(@Validated @RequestBody CekilenCoinRequestDTO requestDTO){
        CekilenCoin responseDTO = this.cekilenCoinService.cekCoin(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }

}
