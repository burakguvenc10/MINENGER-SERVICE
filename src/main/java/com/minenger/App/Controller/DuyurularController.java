package com.minenger.App.Controller;

import com.minenger.App.Dto.Duyurular.DuyurularRequestDTO;
import com.minenger.App.Dto.Duyurular.response.GetDuyurularApiResponse;
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
    public ResponseEntity<GetDuyurularApiResponse> getDuyurular(@RequestParam Long id,
                                                                @RequestParam(required = false) String baslik,
                                                                @RequestParam(required = false) String icerik){
        DuyurularRequestDTO requestDTO = new DuyurularRequestDTO(id,baslik,icerik);
        GetDuyurularApiResponse responseDTO = this.duyurularService.getDuyuru(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }

    @PostMapping(value = "/postduyuru")
    public ResponseEntity<GetDuyurularApiResponse> postDuyuru(@RequestBody DuyurularRequestDTO requestDTO){
        GetDuyurularApiResponse responseDTO = this.duyurularService.postDuyurular(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }






}
