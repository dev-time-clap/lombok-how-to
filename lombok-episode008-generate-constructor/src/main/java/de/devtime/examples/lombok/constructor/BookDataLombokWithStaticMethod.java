package de.devtime.examples.lombok.constructor;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@RequiredArgsConstructor(staticName = "create")
@Getter
@Setter
public class BookDataLombokWithStaticMethod {

  private final String isbn;
  private String title;
  private String subtitle;
  private String summary;
  private int edition;
  private LocalDate yearOfPublication;

}
