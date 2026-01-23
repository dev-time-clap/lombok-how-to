package de.devtime.examples.lombok.getter.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class GetterSetterApplication {

  public static void main(final String[] args) {
    SpringApplication.run(GetterSetterApplication.class, args);
  }

  @Setter(onMethod_ = @Autowired)
  private BookCache bookCache;

  @EventListener(ContextRefreshedEvent.class)
  public void onContextRefreshedEvent() {
    this.bookCache.getBooks().forEach(book -> log.info("book: {}", book));
  }
}
