package de.devtime.examples.lombok.getter.setter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GetterSetterDemo {

  public static void main(final String[] args) {
    example1();
    example2();
    example3();
  }

  private static void example1() {
    BookData bookData = new BookData();
    bookData.setIsbn("ISBN-4711");
    bookData.setTitle("Just a book");
    bookData.setAuthor("Morrigan");
    log.info("bookData: {}", bookData);
  }

  private static void example2() {
    BookData bookData = new BookData()
        .setIsbn("ISBN-4711")
        .setTitle("Just a book")
        .setAuthor("Morrigan");
    log.info("bookData: {}", bookData);
  }

  private static void example3() {
    // Um die fluent Schreibweise nutzen zu können muss in der lombok.config fogende Konfiguration aktiv sein:
    // lombok.accessors.fluent=true
    //
    //    BookData bookData = new BookData()
    //        .isbn("ISBN-4711")
    //        .title("Just a book")
    //        .author("Morrigan");
    //    log.info("bookData: {}", bookData);
  }
}
