package de.devtime.examples.lombok.canequal;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonDataProxy extends PersonData {

  public PersonDataProxy(final String name) {
    super(name);
  }

  @Override
  public String getName() {
    log.info("get name via proxy object");
    return super.getName();
  }

  @Override
  public PersonData setName(final String name) {
    log.info("set name via proxy object");
    return super.setName(name);
  }
}
