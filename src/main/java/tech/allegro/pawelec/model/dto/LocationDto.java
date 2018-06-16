package tech.allegro.pawelec.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class LocationDto {
    private String latitude_from;
    private String latitude_to;
    private String longitude_from;
    private String longitude_to;

}
