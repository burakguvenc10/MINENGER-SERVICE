package com.minenger.App.Dto.Duyurular;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DuyurularRequestDTO {

    private Long id;

    private String baslik;

    private String icerik;

}
