package de.devtime.examples.lombok.getter.setter;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Getter;

@Service
public class BookCache {

  @Getter
  private final List<BookData> books = new LinkedList<>();

  public BookCache() {
    this.books.add(new BookData().setIsbn("ISBN-4711").setTitle("Just a book").setAuthor("Morrigan"));
    this.books.add(new BookData().setIsbn("ISBN-4712").setTitle("Just a second book").setAuthor("Morrigan"));
    this.books.add(new BookData().setIsbn("ISBN-4713").setTitle("Just a third book").setAuthor("Morrigan"));
  }
}
