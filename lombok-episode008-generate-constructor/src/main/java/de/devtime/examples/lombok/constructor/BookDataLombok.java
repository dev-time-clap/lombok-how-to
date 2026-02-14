package de.devtime.examples.lombok.constructor;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BookDataLombok {

  private final String isbn;
  private final String title;
  private final String subtitle;
  private final String summary;
  private final int edition;
  private final LocalDate yearOfPublication;

}
