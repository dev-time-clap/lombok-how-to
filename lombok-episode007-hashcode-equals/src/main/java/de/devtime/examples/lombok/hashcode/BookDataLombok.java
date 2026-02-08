package de.devtime.examples.lombok.hashcode;

import lombok.EqualsAndHashCode;
import lombok.Setter;

@Setter
@EqualsAndHashCode
public class BookDataLombok {

  private String isbn;
  private String title;
  private String author;

}
