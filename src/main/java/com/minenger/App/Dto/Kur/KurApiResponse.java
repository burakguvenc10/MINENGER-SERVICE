package com.minenger.App.Dto.Kur;

import com.minenger.App.Dto.BaseApiResponseDTO;
import com.minenger.App.Entity.Kur.Kur;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KurApiResponse extends BaseApiResponseDTO {

    private Kur kur;

    public KurApiResponse(String message, Kur kur) {
        super(message);
        this.kur = kur;
    }
}
