package de.devtime.examples.lombok.constructor;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class BookData {

  private final String isbn;
  private final String title;
  private final String subtitle;
  private final String summary;
  private final int edition;
  private final LocalDate yearOfPublication;

  public BookData(
      final String isbn,
      final String title,
      final String subtitle,
      final String summary,
      final int edition,
      final LocalDate yearOfPublication) {
    super();
    this.isbn = isbn;
    this.title = title;
    this.subtitle = subtitle;
    this.summary = summary;
    this.edition = edition;
    this.yearOfPublication = yearOfPublication;
  }

}
