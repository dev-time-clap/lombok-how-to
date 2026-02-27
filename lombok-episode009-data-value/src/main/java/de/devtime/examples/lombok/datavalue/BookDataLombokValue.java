package de.devtime.examples.lombok.datavalue;

import java.time.LocalDate;

import lombok.Value;

@Value(staticConstructor = "of")
public class BookDataLombokValue {

  private String isbn;
  private String title;
  private String subtitle;
  private String summary;
  private int edition;
  private LocalDate yearOfPublication;

}
