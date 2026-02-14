package de.devtime.examples.lombok.constructor;

import java.time.LocalDate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConstructorDemo {

  public static void main(final String[] args) {

    new BookData("ISBN-0815", "Just a book", "code like a pro", "", 1, LocalDate.parse("2000-01-01"));

    new BookDataLombok("ISBN-0815", "Just a book", "code like a pro", "", 1, LocalDate.parse("2000-01-01"));

    new BookDataLombokWithFinal("ISBN-0815");

    BookDataLombokWithStaticMethod.create("ISBN-0815");

    new PersonData("Thomas", "Anderson", "Neo", LocalDate.parse("1962-03-11"));
    new EmployeeData("42");
  }
}
