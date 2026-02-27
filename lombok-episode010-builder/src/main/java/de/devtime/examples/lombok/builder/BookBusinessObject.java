package de.devtime.examples.lombok.builder;

import java.util.function.Consumer;

import de.devtime.examples.lombok.builder.BookBusinessObject.LoanData.LoanDataBuilder;
import lombok.Builder;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BookBusinessObject {

  @Value
  @Builder(setterPrefix = "with")
  public static class LoanData {
    private String isbn;
    private String qrCode;
    private String customerId;
  }

  public void loan(final Consumer<LoanDataBuilder> consumer) {
    LoanDataBuilder builder = LoanData.builder();
    consumer.accept(builder);
    LoanData loanData = builder.build();

    log.info("Loan the book {} to customer {}.", loanData.getIsbn(), loanData.getCustomerId());
  }

}
