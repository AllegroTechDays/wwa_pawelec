package tech.allegro.pawelec.service;

import org.springframework.stereotype.Component;
import tech.allegro.pawelec.model.dto.LocationDto;
import tech.allegro.pawelec.model.dto.PlaceDto;

import java.io.IOException;
import java.util.List;

@Component
public class PlaceService {

  private PlaceMapper placeMapper;
  private NominatimClient nominatimClient;

  public PlaceService(PlaceMapper placeMapper,
                      NominatimClient nominatimClient) {
    this.placeMapper = placeMapper;
    this.nominatimClient = nominatimClient;
  }

  public LocationDto getCoordinatesBy(String locationFrom, String locationTo) throws IOException {
    LocationDto locationDto = new LocationDto();
    nominatimClient.getPlaceDetails(locationFrom);
    nominatimClient.getPlaceDetails(locationTo);
    List<PlaceDto> placesFrom = placeMapper.mapJsonToPlaceDtos(locationFrom);
    List<PlaceDto> placesTo = placeMapper.mapJsonToPlaceDtos(locationTo);
    placeMapper.mapPlaceDtosToPlaces(placesFrom)
            .stream()
            .findFirst()
            .ifPresent(p -> {
              locationDto.setLatitudeFrom(p.getLatitude());
              locationDto.setLongitudeFrom(p.getLongitute());
            });
    placeMapper.mapPlaceDtosToPlaces(placesTo)
            .stream()
            .findFirst()
            .ifPresent(p -> {
              locationDto.setLatitudeTo(p.getLatitude());
              locationDto.setLongitudeTo(p.getLongitute());
            });

    return locationDto;
  }
}
