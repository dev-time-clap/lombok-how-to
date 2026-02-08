package de.devtime.examples.lombok.canequal;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CanEqualDemo {

  public static void main(final String[] args) {
    PersonData p1 = new PersonData("Alice");
    PersonDataProxy p2 = new PersonDataProxy("Alice");

    MitarbeiterData e1 = new MitarbeiterData("Alice", "E1");
    MitarbeiterData e2 = new MitarbeiterData("Alice", "E1");
    MitarbeiterData e3 = new MitarbeiterData("Alice", "E2");

    log.info("p1.equals(p2) = {}                          // true | symmetric",
        fill(p1.equals(p2)));
    log.info("p2.equals(p1) = {}                          // true | symmetric",
        fill(p2.equals(p1)));
    log.info("");
    log.info("e1.equals(e2) = {}                          // true | symmetric",
        fill(e1.equals(e2)));
    log.info("e2.equals(e1) = {}                          // true | symmetric",
        fill(e2.equals(e1)));
    log.info("e2.equals(e3) = {}                          // false",
        fill(e2.equals(e3)));
    log.info("");
    log.info("p1.equals(e1) = {}                          // false | symmetric",
        fill(p1.equals(e1)));
    log.info("e1.equals(p1) = {}                          // false | symmetric",
        fill(e1.equals(p1)));

  }

  private static String fill(final boolean equals) {
    return StringUtils.rightPad(Boolean.toString(equals), 22);
  }
}
