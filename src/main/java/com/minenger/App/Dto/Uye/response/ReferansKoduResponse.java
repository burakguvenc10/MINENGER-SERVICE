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
public class ReferansKoduResponse extends BaseApiResponseDTO {

    private String referansKodu;

    public ReferansKoduResponse(String message, String referansKodu) {
        super(message);
        this.referansKodu = referansKodu;
    }

}