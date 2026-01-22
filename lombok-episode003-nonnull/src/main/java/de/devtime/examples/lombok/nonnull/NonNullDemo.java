package de.devtime.examples.lombok.nonnull;

import java.lang.reflect.Field;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NonNullDemo {

  public static void main(final String[] args) throws Exception {
    justLogException(() -> {
      logBook(null);
    });

    justLogException(() -> {
      BookData.builder()
          .withIsbn(null)
          .withTitle(null)
          .build();
    });

    var bookData = new BookData("ISBN-4711", null, null);
    bookData.setIsbn("ISBN-4711");

    Field isbnField = BookData.class.getDeclaredField("isbn");
    isbnField.setAccessible(true);
    isbnField.set(bookData, null);

    @NonNull
    String isbn = bookData.getIsbn();

    log.info("isbn: {}", isbn);
  }

  private static void logBook(@NonNull final BookData bookToLog) {
    log.info("Book data: {}", bookToLog.getAuthor());
  }

  private static void justLogException(final Runnable task) {
    try {
      task.run();
    } catch (Exception e) {
      log.error(e.getMessage(), e);
    }
  }

}
