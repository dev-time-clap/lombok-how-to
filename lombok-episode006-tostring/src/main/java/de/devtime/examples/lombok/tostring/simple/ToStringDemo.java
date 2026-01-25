package de.devtime.examples.lombok.tostring.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToStringDemo {

  public static void main(final String[] args) {
    BookData bookData = new BookData()
        .setIsbn("ISBN-4711")
        .setTitle("Just a book")
        .setAuthor("Morrigan");
    log.info("bookData: {}", bookData);
  }
}
