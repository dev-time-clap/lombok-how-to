package de.devtime.examples.lombok.tostring.simple;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookData extends AbstractTechnicalData {

  private String isbn;
  private String title;
  private String author;

}
