package tech.allegro.pawelec.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import tech.allegro.pawelec.model.Place;
import tech.allegro.pawelec.model.dto.PlaceDto;
import tech.allegro.pawelec.supplier.NominatimApiSupplier;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PlaceMapper {

    @Autowired
    NominatimApiSupplier nominatimApiSupplier;

    public String getJSONForSearchingPlace(String place) throws UnsupportedEncodingException {
        return nominatimApiSupplier.getURLWithQuery(place);
    }

    public List<PlaceDto> mapJsonToPlaceDtos(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PlaceDto>> mapType = new TypeReference<List<PlaceDto>>() {};
        List<PlaceDto> places = objectMapper.readValue(json, new TypeReference<List<PlaceDto>>(){});
        return places;
    }

    public Set<Place> mapPlaceDtosToPlaces(PlaceDto... placeDtos) {
        Set<Place> places = new HashSet<>();

//        for (PlaceDto placeDto : placeDtos) {
//            Place place = new Place.Builder().
//        }

        return places;
    }
}
