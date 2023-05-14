package com.minenger.App.Controller;

import com.minenger.App.Dto.Duyurular.DuyurularApiResponse;
import com.minenger.App.Service.Duyurular.IDuyurularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/duyurular")
public class DuyurularController {

    @Autowired
    private IDuyurularService duyurularService;

    @GetMapping(value = "/duyurulist")
    public ResponseEntity<DuyurularApiResponse> getDuyurular(){
        DuyurularApiResponse responseDTO = this.duyurularService.getDuyuru();
        return ResponseEntity.ok(responseDTO);
    }

}
