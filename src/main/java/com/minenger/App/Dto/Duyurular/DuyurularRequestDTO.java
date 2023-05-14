package com.minenger.App.Dto.Duyurular;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DuyurularRequestDTO {

    private Long id;

    private String baslik;

    private String icerik;

}
