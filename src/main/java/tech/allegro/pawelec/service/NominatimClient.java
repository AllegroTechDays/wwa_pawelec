package tech.allegro.pawelec.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tech.allegro.pawelec.model.dto.PlaceDto;
import tech.allegro.pawelec.supplier.NominatimApiSupplier;

@Component
public class NominatimClient {

  private RestTemplate restTemplate;
  private NominatimApiSupplier nominatimApiSupplier;

  public NominatimClient(RestTemplate restTemplate,
                         NominatimApiSupplier nominatimApiSupplier) {
    this.restTemplate = restTemplate;
    this.nominatimApiSupplier = nominatimApiSupplier;
  }

  public PlaceDto getPlaceDetails(String place) {
    String url = getJSONForSearchingPlace(place);
    PlaceDto placeDto = restTemplate.getForObject(url, PlaceDto.class);
    return placeDto;
  }

  private String getJSONForSearchingPlace(String place) {
    return nominatimApiSupplier.getURLWithQuery(place);
  }
}
