package com.minenger.App.Dto.Duyurular.response;

import com.minenger.App.Dto.response.BaseApiResponseDTO;
import com.minenger.App.Entity.Duyurular.Duyuru;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetDuyurularApiResponse extends BaseApiResponseDTO {

    private Duyuru data;

    public  GetDuyurularApiResponse(String message, Duyuru data){
        super(message);
        this.data = data;
    }

    public  GetDuyurularApiResponse(String message){
        super(message);
    }



}
