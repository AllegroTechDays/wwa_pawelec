package tech.allegro.pawelec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tech.allegro.pawelec.model.dto.LocationDto;
import tech.allegro.pawelec.service.PlaceService;

import java.io.IOException;

@RestController
public class PlaceController {

  private PlaceService placeService;

  public PlaceController(PlaceService placeService) {
    this.placeService = placeService;
  }

  @GetMapping("/location/{locationFrom}/{locationTo}")
  public LocationDto location(@PathVariable("locationFrom") String locationfrom,
                              @PathVariable("locationTo") String locationTo) throws IOException {

    return placeService.getCoordinatesBy(locationfrom, locationTo);
  }
}
