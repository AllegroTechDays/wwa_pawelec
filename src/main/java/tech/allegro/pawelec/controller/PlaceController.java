package tech.allegro.pawelec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tech.allegro.pawelec.model.dto.LocationDto;

@RestController
public class PlaceController {


  @GetMapping("/location/{locationfrom}/{locationTo}")
  public LocationDto location(@PathVariable("locationfrom") String locationfrom,
                              @PathVariable("locationTo") String locationTo) {

    return null;
  }
}
