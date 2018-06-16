package tech.allegro.pawelec.service;

import org.springframework.stereotype.Component;
import tech.allegro.pawelec.model.dto.LocationDto;

import java.io.IOException;

@Component
public class PlaceService {

  private PlaceMapper placeMapper;
  private NominatimClient nominatimClient;

  public PlaceService(PlaceMapper placeMapper,
                      NominatimClient nominatimClient) {
    this.placeMapper = placeMapper;
    this.nominatimClient = nominatimClient;
  }

  public LocationDto gerCoordinatesBy(String locationFrom, String locationTo) throws IOException {
    placeMapper.mapJsonToPlaceDtos(locationFrom);
    return null;
  }
}
