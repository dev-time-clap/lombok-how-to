package de.devtime.examples.lombok.datavalue;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BookDataLombok {

  private final String isbn;
  private String title;
  private String subtitle;
  private String summary;
  private int edition;
  private LocalDate yearOfPublication;

}
