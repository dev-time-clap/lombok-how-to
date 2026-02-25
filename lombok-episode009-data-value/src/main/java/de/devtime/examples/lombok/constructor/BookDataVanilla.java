package de.devtime.examples.lombok.constructor;

import java.time.LocalDate;
import java.util.Objects;

public class BookDataVanilla {

  private final String isbn;
  private String title;
  private String subtitle;
  private String summary;
  private int edition;
  private LocalDate yearOfPublication;

  public BookDataVanilla(final String isbn) {
    super();
    this.isbn = isbn;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(final String title) {
    this.title = title;
  }

  public String getSubtitle() {
    return this.subtitle;
  }

  public void setSubtitle(final String subtitle) {
    this.subtitle = subtitle;
  }

  public String getSummary() {
    return this.summary;
  }

  public void setSummary(final String summary) {
    this.summary = summary;
  }

  public int getEdition() {
    return this.edition;
  }

  public void setEdition(final int edition) {
    this.edition = edition;
  }

  public LocalDate getYearOfPublication() {
    return this.yearOfPublication;
  }

  public void setYearOfPublication(final LocalDate yearOfPublication) {
    this.yearOfPublication = yearOfPublication;
  }

  public String getIsbn() {
    return this.isbn;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.edition, this.isbn, this.subtitle, this.summary, this.title, this.yearOfPublication);
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
    BookDataVanilla other = (BookDataVanilla) obj;
    return this.edition == other.edition && Objects.equals(this.isbn, other.isbn)
        && Objects.equals(this.subtitle, other.subtitle)
        && Objects.equals(this.summary, other.summary) && Objects.equals(this.title, other.title)
        && Objects.equals(this.yearOfPublication, other.yearOfPublication);
  }

  @Override
  public String toString() {
    return new StringBuilder()
        .append(getClass().getSimpleName()).append("(")
        .append("isbn=").append(this.isbn)
        .append(", title=").append(this.title)
        .append(", subtitle=").append(this.subtitle)
        .append(", summary=").append(this.summary)
        .append(", edition=").append(this.edition)
        .append(", yearOfPublication=").append(this.yearOfPublication)
        .append(")").toString();
  }
}
