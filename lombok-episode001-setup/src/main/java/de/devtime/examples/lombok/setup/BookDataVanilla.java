package de.devtime.examples.lombok.setup;

import java.util.Objects;

public class BookDataVanilla {

  private String isbn;
  private String title;
  private String author;

  public BookDataVanilla(final String isbn, final String title, final String author) {
    super();
    this.isbn = isbn;
    this.title = title;
    this.author = author;
  }

  public String getIsbn() {
    return this.isbn;
  }

  public void setIsbn(final String isbn) {
    this.isbn = isbn;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(final String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(final String author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "BookDataVanilla [isbn=" + this.isbn + ", title=" + this.title + ", author=" + this.author + "]";
  }

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
    final BookDataVanilla other = (BookDataVanilla) obj;
    return Objects.equals(this.author, other.author) && Objects.equals(this.isbn, other.isbn)
        && Objects.equals(this.title, other.title);
  }

  public static class BookDataVanillaBuilder {

    private String isbn;
    private String title;
    private String author;

    BookDataVanillaBuilder() {}

    public BookDataVanillaBuilder withIsbn(final String isbn) {
      this.isbn = isbn;
      return this;
    }

    public BookDataVanillaBuilder withTitle(final String title) {
      this.title = title;
      return this;
    }

    public BookDataVanillaBuilder withAuthor(final String author) {
      this.author = author;
      return this;
    }

    public BookDataVanilla build() {
      return new BookDataVanilla(this.isbn, this.title, this.author);
    }

    @Override
    public String toString() {
      return "BookDataVanillaBuilder [isbn=" + this.isbn + ", title=" + this.title + ", author=" + this.author + "]";
    }
  }
}
