package com.minenger.App.Controller;

import com.minenger.App.Dto.Coin.CoinApiResponse;
import com.minenger.App.Dto.Coin.CoinRequestDTO;
import com.minenger.App.Service.Coin.ICoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/coin")
public class CoinController {
    @Autowired
    private ICoinService coinService;

    @PostMapping(value = "/postcoin")
    public ResponseEntity<CoinApiResponse> postCoin(@Validated @RequestBody CoinRequestDTO requestDTO){
        CoinApiResponse responseDTO = this.coinService.postKazilanCoin(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping(value = "/findcoin")
    public ResponseEntity<CoinApiResponse> findCoin(@RequestParam Long id){
        CoinApiResponse responseDTO = this.coinService.findByCoin(id);
        return ResponseEntity.ok(responseDTO);
    }

}
