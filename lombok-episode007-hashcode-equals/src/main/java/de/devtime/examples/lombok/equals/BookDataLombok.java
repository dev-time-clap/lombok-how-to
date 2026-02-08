package de.devtime.examples.lombok.equals;

import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Exclude;
import lombok.Setter;

@Setter
@EqualsAndHashCode(callSuper = true)
public class BookDataLombok extends AbstractSuperBookDataLombok {

  @Exclude
  private String isbn;
  private String title;
  private String author;

}
