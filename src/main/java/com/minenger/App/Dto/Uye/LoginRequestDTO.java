package com.minenger.App.Dto.Uye;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Getter
@Setter
@AllArgsConstructor
public class LoginRequestDTO {

    private String email;

    private String sifre;

}
