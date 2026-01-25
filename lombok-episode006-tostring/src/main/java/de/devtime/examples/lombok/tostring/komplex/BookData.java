package de.devtime.examples.lombok.tostring.komplex;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Getter
@Setter
@ToString(callSuper = true)
public class BookData extends AbstractTechnicalData {

  private String isbn;
  private String title;
  @Exclude
  private List<AuthorData> authors;

}
