package de.devtime.examples.lombok.getter.setter;

import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookData {

  /**
   * Dies ist meine eindeutige ISBN Nummer für mein Buch.
   * --SETTER--
   * Setzt die eindeutige ISBN Nummer dieses Buches.
   *
   * @param isbn eine eindeutige ISBN Nummer
   * @throws NullPointerException wenn die ISBN Nummer null ist
   */
  @Setter(onParam_ = @Nonnull)
  private String isbn;
  private String title;
  private String author;

  @Override
  public String toString() {
    return new StringBuilder()
        .append(getClass().getSimpleName()).append("[")
        .append("isbn=").append(this.isbn).append(", ")
        .append("title=").append(this.title).append(", ")
        .append("author=").append(this.author)
        .append("]")
        .toString();
  }

}
