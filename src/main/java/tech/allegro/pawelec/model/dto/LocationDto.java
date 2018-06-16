package tech.allegro.pawelec.model.dto;

import lombok.*;

@Data
@Setter
@EqualsAndHashCode
@ToString
public class LocationDto {
    private String latitudeFrom;
    private String latitudeTo;
    private String longitudeFrom;
    private String longitudeTo;

    public String getLatitudeFrom() {
        return latitudeFrom;
    }

    public void setLatitudeFrom(String latitudeFrom) {
        this.latitudeFrom = latitudeFrom;
    }

    public String getLatitudeTo() {
        return latitudeTo;
    }

    public void setLatitudeTo(String latitudeTo) {
        this.latitudeTo = latitudeTo;
    }

    public String getLongitudeFrom() {
        return longitudeFrom;
    }

    public void setLongitudeFrom(String longitudeFrom) {
        this.longitudeFrom = longitudeFrom;
    }

    public String getLongitudeTo() {
        return longitudeTo;
    }

    public void setLongitudeTo(String longitudeTo) {
        this.longitudeTo = longitudeTo;
    }
}
