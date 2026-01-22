package de.devtime.examples.lombok.cleanup;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyDisposableResource {

  public MyDisposableResource() {
    log.info("Resource was created");
  }

  public void executeTask() {
    log.info("Task was executed");
  }

  public void dispose() {
    log.info("Resource was disposed");
  }
}