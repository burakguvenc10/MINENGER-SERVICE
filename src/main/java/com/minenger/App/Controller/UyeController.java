package com.minenger.App.Controller;

import com.minenger.App.Dto.Uye.UyeRequestDTO;
import com.minenger.App.Dto.Uye.ReferansKoduResponse;
import com.minenger.App.Dto.Uye.UyeApiResponse;
import com.minenger.App.Entity.Uye.User;
import com.minenger.App.Service.Uye.IUyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/uye")
public class UyeController {

    @Autowired
    private IUyeService uyeService;

    @PostMapping(value = "/signup")
    public ResponseEntity<User> postSignup(@Validated @RequestBody UyeRequestDTO requestDTO){
        User responseDTO = this.uyeService.postSignup(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping(value = "/signup/user")
    public ResponseEntity<UyeApiResponse> findUser(@RequestParam Long id){
        UyeApiResponse responseDTO = this.uyeService.findByUser(id);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping(value = "/signup/referans")
    public ResponseEntity<ReferansKoduResponse> findUserReferans(@RequestParam Long id){
        ReferansKoduResponse responseDTO = this.uyeService.findReferansKod(id);
        return ResponseEntity.ok(responseDTO);
    }

}
