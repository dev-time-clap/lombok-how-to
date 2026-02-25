package de.devtime.examples.lombok.constructor;

import java.time.LocalDate;

import lombok.Data;

@Data(staticConstructor = "of")
public class BookDataLombokData {

  private final String isbn;
  private String title;
  private String subtitle;
  private String summary;
  private int edition;
  private LocalDate yearOfPublication;

}
