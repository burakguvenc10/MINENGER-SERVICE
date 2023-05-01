package com.minenger.App.Dto.Duyurular.response;

import com.minenger.App.Dto.response.BaseApiResponseDTO;
import com.minenger.App.Entity.Duyurular.Duyuru;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetDuyurularApiResponse extends BaseApiResponseDTO {

    private List<Duyuru> data;

    public  GetDuyurularApiResponse(String message, List<Duyuru> data){
        super(message);
        this.data = data;
    }

    public  GetDuyurularApiResponse(String message){
        super(message);
    }



}
