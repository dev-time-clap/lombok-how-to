package de.devtime.examples.lombok.cleanup;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyClosableResource implements AutoCloseable {

  public MyClosableResource() {
    log.info("Resource was created");
  }

  public void executeTask() {
    log.info("Task was executed");
    //    throw new IllegalStateException("visible exception");
    throw new IllegalStateException("hidden exception");
  }

  @Override
  public void close() throws Exception {
    log.info("Resource was closed");
    throw new IllegalStateException("visible exception");
  }
}