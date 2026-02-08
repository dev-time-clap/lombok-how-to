package de.devtime.examples.lombok.hashcode;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDataIde {

  private String isbn;
  private String title;
  private String author;

  @Override
  public int hashCode() {
    return Objects.hash(this.author, this.isbn, this.title);
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    BookDataIde other = (BookDataIde) obj;
    return Objects.equals(this.author, other.author) && Objects.equals(this.isbn, other.isbn)
        && Objects.equals(this.title, other.title);
  }

}
