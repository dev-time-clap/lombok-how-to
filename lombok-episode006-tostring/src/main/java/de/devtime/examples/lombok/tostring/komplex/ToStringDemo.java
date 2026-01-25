package de.devtime.examples.lombok.tostring.komplex;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToStringDemo {

  public static void main(final String[] args) {
    List<AuthorData> authors = List.of(
        new AuthorData().setArtistName("Morrigan"),
        new AuthorData().setArtistName("Fafnir"),
        new AuthorData().setArtistName("Balder"),
        new AuthorData().setArtistName("Surt"));
    BookData bookData = new BookData()
        .setIsbn("ISBN-4711")
        .setTitle("Just a book")
        .setAuthors(authors);
    log.info("bookData: {}", bookData);
  }
}
