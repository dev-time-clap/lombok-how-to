package de.devtime.examples.lombok.getter.setter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookData {

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
