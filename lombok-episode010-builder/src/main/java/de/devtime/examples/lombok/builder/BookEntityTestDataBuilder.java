package de.devtime.examples.lombok.builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import de.devtime.examples.lombok.builder.BookEntity.BookEntityBuilder;

public class BookEntityTestDataBuilder extends BookEntityBuilder<BookEntityTestDataBuilder> {

  public static BookEntityTestDataBuilder create() {
    return new BookEntityTestDataBuilder();
  }

  public BookEntityTestDataBuilder bookWithJustABookByMorrigan() {
    withEdition(1);
    withIsbn("ISBN-0815");
    withIsOnLoan(false);
    withPersisted(false);
    withSubtitle("Code like a pro");
    withSummary("A book about professional software development.");
    withTitle("Just a book");
    withYearOfPublication(LocalDate.parse("2026-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    return this;
  }
}
