package de.devtime.examples.lombok.hashcode;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HashCodeDemo {

  public static void main(final String[] args) {
    ideGeneratedExample();
    lombokgeneratedExample();
  }

  private static void lombokgeneratedExample() {
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
    log.info("data1.hashCode() = {} | data1.hashCode() = {}     // Selbes Objekt zweimal aufgerufen",
        fill(data1.hashCode()),
        fill(data1.hashCode()));
    log.info("data1.hashCode() = {} | data2.hashCode() = {}     // Verschiedene Objekte mit gleichem Inhalt",
        fill(data1.hashCode()),
        fill(data2.hashCode()));
    log.info("data1.hashCode() = {} | data3.hashCode() = {}     // Verschiedene Objekte mit unterschiedlichem Inhalt",
        fill(data1.hashCode()),
        fill(data3.hashCode()));
  }

  private static String fill(final int hashCode) {
    return StringUtils.rightPad(Integer.toString(hashCode), 12);
  }
}
