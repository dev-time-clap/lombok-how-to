package de.devtime.examples.lombok.e003.nonnull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder(setterPrefix = "with")
public class BookData {

  @NonNull
  private String isbn;
  @NonNull
  private String title;
  @NonNull
  private String author;

}
