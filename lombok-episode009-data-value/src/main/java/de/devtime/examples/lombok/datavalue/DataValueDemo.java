package de.devtime.examples.lombok.datavalue;

import java.time.LocalDate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataValueDemo {

  public static void main(final String[] args) {

    showCaseVanilla();
    showCaseLombok();
    showCaseLombokData();
    showCaseLombokValue();

  }

  private static void showCaseLombokValue() {
    BookDataLombokValue bookDataLombokValue = BookDataLombokValue.of(
        "ISBN-0815",
        "Just a book",
        "code like a pro",
        "",
        1,
        LocalDate.parse("2000-01-01"));
    log.info("book lombok value: {}", bookDataLombokValue);
  }

  private static void showCaseLombokData() {
    BookDataLombokData bookDataLombokData = BookDataLombokData.of("ISBN-0815");
    bookDataLombokData.setEdition(1);
    bookDataLombokData.setSubtitle("code like a pro");
    bookDataLombokData.setSummary("");
    bookDataLombokData.setTitle("Just a book");
    bookDataLombokData.setYearOfPublication(LocalDate.parse("2000-01-01"));
    log.info("book lombok data:   {}", bookDataLombokData);
  }

  private static void showCaseLombok() {
    BookDataLombok bookDataLombok = new BookDataLombok("ISBN-0815");
    bookDataLombok.setEdition(1);
    bookDataLombok.setSubtitle("code like a pro");
    bookDataLombok.setSummary("");
    bookDataLombok.setTitle("Just a book");
    bookDataLombok.setYearOfPublication(LocalDate.parse("2000-01-01"));
    log.info("book lombok:            {}", bookDataLombok);
  }

  private static void showCaseVanilla() {
    BookDataVanilla bookDataVanilla = new BookDataVanilla("ISBN-0815");
    bookDataVanilla.setEdition(1);
    bookDataVanilla.setSubtitle("code like a pro");
    bookDataVanilla.setSummary("");
    bookDataVanilla.setTitle("Just a book");
    bookDataVanilla.setYearOfPublication(LocalDate.parse("2000-01-01"));
    log.info("book vanilla:          {}", bookDataVanilla);
  }
}
