package com.minenger.App.Dto.Uye;

import com.minenger.App.Dto.BaseApiResponseDTO;
import com.minenger.App.Entity.Uye.LoginUser;
import com.minenger.App.Entity.Uye.Uye;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginApiResponse extends BaseApiResponseDTO {

    private LoginUser loginUser;

    public LoginApiResponse(String message, LoginUser loginUser) {
        super(message);
        this.loginUser = loginUser;
    }

    public LoginApiResponse(String message) {
        super(message);
    }

}
