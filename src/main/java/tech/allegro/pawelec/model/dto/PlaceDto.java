package tech.allegro.pawelec.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "place_id",
        "licence",
        "osm_type",
        "osm_id",
        "boundingbox",
        "polygonpoints",
        "latitude",
        "longitute",
        "display_name",
        "class",
        "type",
        "importance",
        "address"
})
public class PlaceDto {

    @JsonProperty("place_id")
    private String placeId;
    @JsonProperty("licence")
    private String licence;
    @JsonProperty("osm_type")
    private String osmType;
    @JsonProperty("osm_id")
    private String osmId;
    @JsonProperty("boundingbox")
    private List<String> boundingbox = new ArrayList<>();
    @JsonProperty("polygonpoints")
    private List<List<String>> polygonpoints = new ArrayList<>();
    @JsonProperty("latitude")
    private String lat;
    @JsonProperty("longitute")
    private String lon;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("class")
    private String _class;
    @JsonProperty("type")
    private String type;
    @JsonProperty("importance")
    private Double importance;
    @JsonProperty("address")
    private AddressDto address;

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getOsmType() {
        return osmType;
    }

    public void setOsmType(String osmType) {
        this.osmType = osmType;
    }

    public String getOsmId() {
        return osmId;
    }

    public void setOsmId(String osmId) {
        this.osmId = osmId;
    }

    public List<String> getBoundingbox() {
        return boundingbox;
    }

    public void setBoundingbox(List<String> boundingbox) {
        this.boundingbox = boundingbox;
    }

    public List<List<String>> getPolygonpoints() {
        return polygonpoints;
    }

    public void setPolygonpoints(List<List<String>> polygonpoints) {
        this.polygonpoints = polygonpoints;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getImportance() {
        return importance;
    }

    public void setImportance(Double importance) {
        this.importance = importance;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaceDto placeDto = (PlaceDto) o;
        return Objects.equals(placeId, placeDto.placeId) &&
                Objects.equals(licence, placeDto.licence) &&
                Objects.equals(osmType, placeDto.osmType) &&
                Objects.equals(osmId, placeDto.osmId) &&
                Objects.equals(boundingbox, placeDto.boundingbox) &&
                Objects.equals(polygonpoints, placeDto.polygonpoints) &&
                Objects.equals(lat, placeDto.lat) &&
                Objects.equals(lon, placeDto.lon) &&
                Objects.equals(displayName, placeDto.displayName) &&
                Objects.equals(_class, placeDto._class) &&
                Objects.equals(type, placeDto.type) &&
                Objects.equals(importance, placeDto.importance) &&
                Objects.equals(address, placeDto.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(placeId, licence, osmType, osmId, boundingbox, polygonpoints, lat, lon, displayName, _class, type, importance, address);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlaceDto{");
        sb.append("placeId='").append(placeId).append('\'');
        sb.append(", licence='").append(licence).append('\'');
        sb.append(", osmType='").append(osmType).append('\'');
        sb.append(", osmId='").append(osmId).append('\'');
        sb.append(", boundingbox=").append(boundingbox);
        sb.append(", polygonpoints=").append(polygonpoints);
        sb.append(", lat='").append(lat).append('\'');
        sb.append(", lon='").append(lon).append('\'');
        sb.append(", displayName='").append(displayName).append('\'');
        sb.append(", _class='").append(_class).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", importance=").append(importance);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}