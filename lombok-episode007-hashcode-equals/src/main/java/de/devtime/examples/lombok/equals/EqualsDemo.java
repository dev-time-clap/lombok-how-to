package de.devtime.examples.lombok.equals;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EqualsDemo {

  public static void main(final String[] args) {
    ideGeneratedExample();
    lombokGeneratedExample();
  }

  private static void lombokGeneratedExample() {
    BookDataLombok data1 = new BookDataLombok().setIsbn("ISBN-0815").setTitle("Just a book").setAuthor("Morrigan");
    BookDataLombok data2 = new BookDataLombok().setIsbn("ISBN-0815").setTitle("Just a book").setAuthor("Morrigan");
    BookDataLombok data3 = new BookDataLombok().setIsbn("ISBN-0816").setTitle("Just a book").setAuthor("Morrigan");
    BookDataLombok dataX = new BookDataLombok().setIsbn("ISBN-0816").setTitle("Just a book").setAuthor("Morrigan");
    BookDataLombok dataY = new BookDataLombok().setIsbn("ISBN-0816").setTitle("Just a book").setAuthor("Morrigan");
    BookDataLombok dataZ = new BookDataLombok().setIsbn("ISBN-0816").setTitle("Just a book").setAuthor("Morrigan");
    log(data1, data2, data3, dataX, dataY, dataZ);
  }

  private static void ideGeneratedExample() {
    BookDataIde data1 = new BookDataIde().setIsbn("ISBN-0815").setTitle("Just a book").setAuthor("Morrigan");
    BookDataIde data2 = new BookDataIde().setIsbn("ISBN-0815").setTitle("Just a book").setAuthor("Morrigan");
    BookDataIde data3 = new BookDataIde().setIsbn("ISBN-0816").setTitle("Just a book").setAuthor("Morrigan");
    BookDataIde dataX = new BookDataIde().setIsbn("ISBN-0816").setTitle("Just a book").setAuthor("Morrigan");
    BookDataIde dataY = new BookDataIde().setIsbn("ISBN-0816").setTitle("Just a book").setAuthor("Morrigan");
    BookDataIde dataZ = new BookDataIde().setIsbn("ISBN-0816").setTitle("Just a book").setAuthor("Morrigan");
    log(data1, data2, data3, dataX, dataY, dataZ);
  }

  private static void log(final Object data1, final Object data2, final Object data3, final Object dataX,
      final Object dataY, final Object dataZ) {
    log.info("data1.equals(data2) = {}                          // Objekte sind inhaltlich gleich",
        fill(data1.equals(data2)));
    log.info("data1.equals(data3) = {}                          // Objekte sind inhaltlich verschieden",
        fill(data1.equals(data3)));
    log.info("");
    log.info("dataX.equals(dataX) = {}                          // reflexive",
        fill(dataX.equals(dataX)));
    log.info("");
    log.info("dataX.equals(dataY) = {}                          // symmetric",
        fill(dataX.equals(dataY)));
    log.info("dataY.equals(dataX) = {}                          // symmetric",
        fill(dataY.equals(dataX)));
    log.info("");
    log.info("dataX.equals(dataY) = {}                          // transitive",
        fill(dataX.equals(dataY)));
    log.info("dataY.equals(dataZ) = {}                          // transitive",
        fill(dataY.equals(dataZ)));
    log.info("dataX.equals(dataZ) = {}                          // transitive",
        fill(dataX.equals(dataZ)));
    log.info("");
    log.info("dataX.equals(dataY) = {}                          // consistent",
        fill(dataX.equals(dataY)));
    log.info("dataX.equals(dataY) = {}                          // consistent",
        fill(dataX.equals(dataY)));
  }

  private static String fill(final boolean equals) {
    return StringUtils.rightPad(Boolean.toString(equals), 22);
  }
}
