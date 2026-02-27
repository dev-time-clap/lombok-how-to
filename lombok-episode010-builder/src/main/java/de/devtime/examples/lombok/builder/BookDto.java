package de.devtime.examples.lombok.builder;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(setterPrefix = "with", toBuilder = true)
public class BookDto {

  private String isbn;
  private String title;
  private String subtitle;
  private String summary;
  private int edition;
  private LocalDate yearOfPublication;

}
