package tech.allegro.pawelec.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDto {

    @JsonProperty("house_number")
    private String houseNumber;
    @JsonProperty("road")
    private String road;
    @JsonProperty("town")
    private String town;
    @JsonProperty("city")
    private String city;
    @JsonProperty("county")
    private String county;
    @JsonProperty("state_district")
    private String stateDistrict;
    @JsonProperty("state")
    private String state;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_code")
    private String countryCode;

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getStateDistrict() {
        return stateDistrict;
    }

    public void setStateDistrict(String stateDistrict) {
        this.stateDistrict = stateDistrict;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    public static final class Builder {
        public String houseNumber;
        public String road;
        public String town;
        public String city;
        public String county;
        public String stateDistrict;
        public String state;
        public String postcode;
        public String country;
        public String countryCode;

        private Builder() {
        }

        public static Builder anAddressDto() {
            return new Builder();
        }

        public Builder houseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder road(String road) {
            this.road = road;
            return this;
        }

        public Builder town(String town) {
            this.town = town;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder county(String county) {
            this.county = county;
            return this;
        }

        public Builder stateDistrict(String stateDistrict) {
            this.stateDistrict = stateDistrict;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Builder postcode(String postcode) {
            this.postcode = postcode;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public AddressDto build() {
            AddressDto addressDto = new AddressDto();
            addressDto.setHouseNumber(houseNumber);
            addressDto.setRoad(road);
            addressDto.setTown(town);
            addressDto.setCity(city);
            addressDto.setCounty(county);
            addressDto.setStateDistrict(stateDistrict);
            addressDto.setState(state);
            addressDto.setPostcode(postcode);
            addressDto.setCountry(country);
            addressDto.setCountryCode(countryCode);
            return addressDto;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDto that = (AddressDto) o;
        return Objects.equals(houseNumber, that.houseNumber) &&
                Objects.equals(road, that.road) &&
                Objects.equals(town, that.town) &&
                Objects.equals(city, that.city) &&
                Objects.equals(county, that.county) &&
                Objects.equals(stateDistrict, that.stateDistrict) &&
                Objects.equals(state, that.state) &&
                Objects.equals(postcode, that.postcode) &&
                Objects.equals(country, that.country) &&
                Objects.equals(countryCode, that.countryCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(houseNumber, road, town, city, county, stateDistrict, state, postcode, country, countryCode);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddressDto{");
        sb.append("houseNumber='").append(houseNumber).append('\'');
        sb.append(", road='").append(road).append('\'');
        sb.append(", town='").append(town).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", county='").append(county).append('\'');
        sb.append(", stateDistrict='").append(stateDistrict).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", postcode='").append(postcode).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", countryCode='").append(countryCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
