package com.minenger.App.Dto.Uye.response;

import com.minenger.App.Dto.BaseApiResponseDTO;
import com.minenger.App.Entity.Uye.User;
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

    private Uye uye;

    private User user;

    public UyeApiResponse(String message, Uye uye) {
        super(message);
        this.uye = uye;
    }

    public UyeApiResponse(String message, User user){
        super(message);
        this.user = user;
    }

    public UyeApiResponse(String message){
        super(message);
    }

}
