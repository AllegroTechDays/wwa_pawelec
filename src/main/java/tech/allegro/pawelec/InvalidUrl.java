package tech.allegro.pawelec;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidUrl extends RuntimeException {

  public InvalidUrl(String message) {
    super(message);
  }
}
