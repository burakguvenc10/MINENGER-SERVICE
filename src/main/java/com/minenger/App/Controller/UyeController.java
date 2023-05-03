package com.minenger.App.Controller;

import com.minenger.App.Dto.Uye.UyeRequestDTO;
import com.minenger.App.Dto.Uye.response.UyeApiResponse;
import com.minenger.App.Service.Uye.IUyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/uye")
public class UyeController {

    @Autowired
    private IUyeService uyeService;

    @PostMapping(value = "/signup")
    public ResponseEntity<UyeApiResponse> Signup(@RequestBody UyeRequestDTO requestDTO){
        UyeApiResponse responseDTO = this.uyeService.postSignup(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }

}
