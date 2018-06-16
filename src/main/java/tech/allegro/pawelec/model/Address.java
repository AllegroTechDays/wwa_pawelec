package tech.allegro.pawelec.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {

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
        private String houseNumber;
        private String road;
        private String town;
        private String city;
        private String county;
        private String stateDistrict;
        private String state;
        private String postcode;
        private String country;
        private String countryCode;

        private Builder() {
        }

        public static Builder anAddress() {
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

        public Address build() {
            Address address = new Address();
            address.setHouseNumber(houseNumber);
            address.setRoad(road);
            address.setTown(town);
            address.setCity(city);
            address.setCounty(county);
            address.setStateDistrict(stateDistrict);
            address.setState(state);
            address.setPostcode(postcode);
            address.setCountry(country);
            address.setCountryCode(countryCode);
            return address;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(houseNumber, address.houseNumber) &&
                Objects.equals(road, address.road) &&
                Objects.equals(town, address.town) &&
                Objects.equals(city, address.city) &&
                Objects.equals(county, address.county) &&
                Objects.equals(stateDistrict, address.stateDistrict) &&
                Objects.equals(state, address.state) &&
                Objects.equals(postcode, address.postcode) &&
                Objects.equals(country, address.country) &&
                Objects.equals(countryCode, address.countryCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(houseNumber, road, town, city, county, stateDistrict, state, postcode, country, countryCode);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
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
