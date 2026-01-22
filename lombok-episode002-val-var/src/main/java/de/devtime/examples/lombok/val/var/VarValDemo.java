package de.devtime.examples.lombok.val.var;

import java.util.ArrayList;
import java.util.List;

import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VarValDemo {

  private static final String UNKNOWN_AUTHOR = "unbekannt";

  public static void main(final String[] args) {
    finalHell();
    lombokVal("Just a book");
    varExample();
  }

  private static void varExample() {
    var title = "First book";
    log.info("title: {}", title);
    title = "Second book";
    log.info("title: {}", title);
  }

  private static void lombokVal(final String title) {
    val bookTitle = title;
    val isbnList = List.of("ISBN-4711", "ISBN-4712", "ISBN-4713");
    val books = new ArrayList<BookData>();

    for (val nextIsbn : isbnList) {
      val bookData = BookData.builder()
          .withAuthor(UNKNOWN_AUTHOR)
          .withIsbn(nextIsbn)
          .withTitle(bookTitle)
          .build();
      books.add(bookData);
    }
    books.forEach(book -> log.info("{}", book));
  }

  private static void finalHell() {
    final String bookTitle = "Just a book";
    final List<String> isbnList = List.of("ISBN-4711", "ISBN-4712", "ISBN-4713");
    final List<BookData> books = new ArrayList<>();

    for (final String nextIsbn : isbnList) {
      final BookData bookData = BookData.builder()
          .withAuthor(UNKNOWN_AUTHOR)
          .withIsbn(nextIsbn)
          .withTitle(bookTitle)
          .build();
      books.add(bookData);
    }

    books.forEach(book -> log.info("{}", book));
  }
}