package com.minenger.App.Controller;

import com.minenger.App.Dto.Duyurular.DuyurularRequestDTO;
import com.minenger.App.Dto.Duyurular.response.GetDuyurularApiResponse;
import com.minenger.App.Service.Duyurular.IDuyurularService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping(value = "/duyurular")

public class DuyurularController {

    private final IDuyurularService duyurularService;


    public DuyurularController(IDuyurularService duyurularService) {
        this.duyurularService = duyurularService;
    }


    @GetMapping(value = "/getDuyurular")
    public ResponseEntity<GetDuyurularApiResponse> getDuyurular(@Valid @RequestBody DuyurularRequestDTO requestDTO){
        GetDuyurularApiResponse responseDTO = this.duyurularService.getDuyuru(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }






}
