package com.minenger.App.Dto.Duyurular;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class DuyurularRequestDTO {

    @NotNull(message = "Başlık Zorunlu Bir Alandır.")
    private String baslik;

    @NotNull(message = "İçerik Zorunlu Bir Alandır.")
    private String icerik;

}
