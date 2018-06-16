package tech.allegro.pawelec.model.dto;

import java.util.Objects;

public class LocationDto {
    private String latitude_from;
    private String latitude_to;
    private String longitude_from;
    private String longitude_to;

    public String getLatitude_from() {
        return latitude_from;
    }

    public void setLatitude_from(String latitude_from) {
        this.latitude_from = latitude_from;
    }

    public String getLatitude_to() {
        return latitude_to;
    }

    public void setLatitude_to(String latitude_to) {
        this.latitude_to = latitude_to;
    }

    public String getLongitude_from() {
        return longitude_from;
    }

    public void setLongitude_from(String longitude_from) {
        this.longitude_from = longitude_from;
    }

    public String getLongitude_to() {
        return longitude_to;
    }

    public void setLongitude_to(String longitude_to) {
        this.longitude_to = longitude_to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationDto that = (LocationDto) o;
        return Objects.equals(latitude_from, that.latitude_from) &&
                Objects.equals(latitude_to, that.latitude_to) &&
                Objects.equals(longitude_from, that.longitude_from) &&
                Objects.equals(longitude_to, that.longitude_to);
    }

    @Override
    public int hashCode() {

        return Objects.hash(latitude_from, latitude_to, longitude_from, longitude_to);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LocationDto{");
        sb.append("latitude_from='").append(latitude_from).append('\'');
        sb.append(", latitude_to='").append(latitude_to).append('\'');
        sb.append(", longitude_from='").append(longitude_from).append('\'');
        sb.append(", longitude_to='").append(longitude_to).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
