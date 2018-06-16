package tech.allegro.pawelec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Place {
    @JsonProperty("place_id")
    private String placeId;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitute")
    private String longitute;
    @JsonProperty("display_name")
    private String displayName;
    @JsonIgnore
    private String osmId;
    @JsonProperty("address")
    private Address address;

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitute() {
        return longitute;
    }

    public void setLongitute(String longitute) {
        this.longitute = longitute;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getOsmId() {
        return osmId;
    }

    public void setOsmId(String osmId) {
        this.osmId = osmId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(placeId, place.placeId) &&
                Objects.equals(latitude, place.latitude) &&
                Objects.equals(longitute, place.longitute) &&
                Objects.equals(displayName, place.displayName) &&
                Objects.equals(osmId, place.osmId) &&
                Objects.equals(address, place.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(placeId, latitude, longitute, displayName, osmId, address);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Place{");
        sb.append("placeId='").append(placeId).append('\'');
        sb.append(", latitude='").append(latitude).append('\'');
        sb.append(", longitute='").append(longitute).append('\'');
        sb.append(", displayName='").append(displayName).append('\'');
        sb.append(", osmId='").append(osmId).append('\'');
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder {
        private String placeId;
        private String latitude;
        private String longitute;
        private String displayName;
        private String osmId;
        private Address address;

        private Builder() {
        }

        public static Builder aPlace() {
            return new Builder();
        }

        public Builder placeId(String placeId) {
            this.placeId = placeId;
            return this;
        }

        public Builder latitude(String latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder longitute(String longitute) {
            this.longitute = longitute;
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder osmId(String osmId) {
            this.osmId = osmId;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public Place build() {
            Place place = new Place();
            place.setPlaceId(placeId);
            place.setLatitude(latitude);
            place.setLongitute(longitute);
            place.setDisplayName(displayName);
            place.setOsmId(osmId);
            place.setAddress(address);
            return place;
        }
    }
}
