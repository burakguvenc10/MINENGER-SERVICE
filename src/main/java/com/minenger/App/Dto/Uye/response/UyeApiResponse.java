package com.minenger.App.Dto.Uye.response;

import com.minenger.App.Dto.BaseApiResponseDTO;
import com.minenger.App.Entity.Uye.Uye;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UyeApiResponse extends BaseApiResponseDTO {

    private Uye data;

    public UyeApiResponse(String message, Uye data){
        super(message);
        this.data = data;
    }
}
