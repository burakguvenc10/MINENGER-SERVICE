package com.minenger.App.Dto.Duyurular;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DuyurularRequestDTO {

    private Long id;

    private String baslik;

    private String icerik;

}
