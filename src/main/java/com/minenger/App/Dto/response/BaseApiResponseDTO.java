package com.minenger.App.Dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.minenger.App.Entity.Duyurular.Duyuru;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseApiResponseDTO {


    public BaseApiResponseDTO(String message, List<Duyuru> data) {
    }
}
