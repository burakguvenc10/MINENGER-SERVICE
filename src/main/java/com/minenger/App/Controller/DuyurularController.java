package com.minenger.App.Controller;

import com.minenger.App.Dto.Duyurular.DuyurularRequestDTO;
import com.minenger.App.Dto.Duyurular.response.GetDuyurularApiResponse;
import com.minenger.App.Service.Duyurular.IDuyurularService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



@Validated
@RestController
@RequestMapping(value = "/duyurular")

public class DuyurularController {

    private final IDuyurularService duyurularService;


    public DuyurularController(IDuyurularService duyurularService) {
        this.duyurularService = duyurularService;
    }


    @GetMapping(value = "/getDuyurular")
    public ResponseEntity<GetDuyurularApiResponse> getDuyurular(@RequestParam(required = false) Long id,
                                                                @RequestParam(required = false) String baslik,
                                                                @RequestParam(required = false) String icerik){
        DuyurularRequestDTO requestDTO = new DuyurularRequestDTO(id,baslik,icerik);
        GetDuyurularApiResponse responseDTO = this.duyurularService.getDuyuru(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }

    @PostMapping(value = "/postDuyuru")
    public ResponseEntity<GetDuyurularApiResponse> postDuyuru(@RequestBody DuyurularRequestDTO requestDTO){
        GetDuyurularApiResponse responseDTO = this.duyurularService.postDuyurular(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }






}
