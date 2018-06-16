package tech.allegro.pawelec.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tech.allegro.pawelec.model.dto.PlaceDto;
import tech.allegro.pawelec.supplier.NominatimApiSupplier;

import java.util.ArrayList;
import java.util.List;

@Component
public class NominatimClient {

  private RestTemplate restTemplate;
  private NominatimApiSupplier nominatimApiSupplier;

  public NominatimClient(RestTemplate restTemplate,
                         NominatimApiSupplier nominatimApiSupplier) {
    this.restTemplate = restTemplate;
    this.nominatimApiSupplier = nominatimApiSupplier;
  }

  public List<PlaceDto> getPlaceDetails(String place) {
    String url = getJSONForSearchingPlace(place);
    ParameterizedTypeReference<List<PlaceDto>> responseType = new ParameterizedTypeReference<List<PlaceDto>>() {};
    List<PlaceDto> placeDto = new ArrayList<>();
             restTemplate.exchange(url, HttpMethod.GET, HttpEntity.EMPTY, responseType);
    return placeDto;
  }

  private String getJSONForSearchingPlace(String place) {
    return nominatimApiSupplier.getURLWithQuery(place);
  }
}
