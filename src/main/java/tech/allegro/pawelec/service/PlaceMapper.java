package tech.allegro.pawelec.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
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
import java.util.stream.Collectors;

public class PlaceMapper {



    public List<PlaceDto> mapJsonToPlaceDtos(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PlaceDto>> mapType = new TypeReference<List<PlaceDto>>() {};
        List<PlaceDto> places = objectMapper.readValue(json, new TypeReference<List<PlaceDto>>(){});
        return places;
    }

    public Set<Place> mapPlaceDtosToPlaces(List<PlaceDto> placeDtos) {
        ModelMapper mapper = new ModelMapper();
        return placeDtos
                .stream()
                .map(place -> mapper.map(place,Place.class))
                .collect(Collectors.toSet());
    }
}
