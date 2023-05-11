package com.minenger.App.Dto.Duyurular;

import com.minenger.App.Dto.BaseApiResponseDTO;
import com.minenger.App.Entity.Duyurular.Duyuru;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DuyurularApiResponse extends BaseApiResponseDTO {

    private List<Duyuru> data;

    public DuyurularApiResponse(String message, List<Duyuru> data){
        super(message);
        this.data = data;
    }


}
