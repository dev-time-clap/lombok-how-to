package de.devtime.examples.lombok.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderDemo {

  public static void main(final String[] args) {

    BookDto bookDto = BookDto.builder()
        .withIsbn("ISBN-0815")
        .withTitle("Just a book")
        .build();
    log.info("bookDto: {}", bookDto);

    BookDto bookDto2 = bookDto.toBuilder()
        .withSubtitle("Code like a pro")
        .build();
    log.info("bookDto2: {}", bookDto2);

    BookEntity bookEntity = BookEntityTestDataBuilder.create()
        .bookWithJustABookByMorrigan()
        .buildAndInit();
    log.info("bookEntity: {}", bookEntity);

    BookEntity bookEntity2 = BookEntityTestDataBuilder.create()
        .bookWithJustABookByMorrigan()
        .withIsbn("ISBN-0816").and()
        .buildAndInit();
    log.info("bookEntity2: {}", bookEntity2);

    BookBusinessObject book = new BookBusinessObject();
    book.loan(data -> data
        .withIsbn("ISBN-0815")
        .withQrCode("XYZ")
        .withCustomerId("morrigan-123"));

  }
}
