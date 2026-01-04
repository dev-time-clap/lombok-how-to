package de.devtime.examples.lombok.e004.cleanup;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

import lombok.Cleanup;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CleanUpDemo {

  public static void main(final String[] args) throws IOException {
    String filename = CleanUpDemo.class.getClassLoader().getResource("application.yaml").getPath();
    CleanUpDemo demo = new CleanUpDemo();
    //    demo.openResourceOldSchoolWay(filename);
    //    demo.openResourceLombokWay(filename);
    //    demo.openResourceModernWay(filename);
    //    demo.openResourceModernWayDetails(filename);
    //    demo.exceptionHandling();
    demo.nonAutoClosableResource();
  }

  void openResourceOldSchoolWay(final String filename) throws IOException {
    InputStream in = new FileInputStream(filename);
    try {
      String fileContent = IOUtils.toString(in, StandardCharsets.UTF_8);
      log.info("openResourceOldSchoolWay -> file content is:\n{}", fileContent);
    } finally {
      if (in != null) {
        in.close();
      }
    }
  }

  // https://projectlombok.org/features/Cleanup
  void openResourceLombokWay(final String filename) throws IOException {
    @Cleanup
    InputStream in = new FileInputStream(filename);

    String fileContent = IOUtils.toString(in, StandardCharsets.UTF_8);
    log.info("openResourceOldSchoolWay -> file content is:\n{}", fileContent);
  }

  void openResourceModernWay(final String filename) throws IOException {
    try (InputStream in = new FileInputStream(filename)) {
      String fileContent = IOUtils.toString(in, StandardCharsets.UTF_8);
      log.info("openResourceOldSchoolWay -> file content is:\n{}", fileContent);
    }
  }

  void openResourceModernWayDetails(final String filename) throws IOException {
    InputStream in = null;
    Exception outerException = null;
    try {
      in = new FileInputStream(filename);
      String fileContent = IOUtils.toString(in, StandardCharsets.UTF_8);
      log.info("openResourceModernWayDetails -> file content is:\n{}", fileContent);
    } catch (Exception e) {
      outerException = e;
      throw e;
    } finally {
      if (outerException != null) {
        try {
          in.close();
        } catch (Throwable t) {
          outerException.addSuppressed(t);
        }
      } else {
        in.close();
      }
    }
  }

  void exceptionHandling() {
    log.info("Using @CleanUp annotation");
    try {
      @Cleanup
      MyClosableResource myResource = new MyClosableResource();
      myResource.executeTask();
    } catch (Exception e) {
      log.error(e.getMessage(), e);
    }

    log.info("Using try-with-resources Java 7 statement");
    try (MyClosableResource myResource = new MyClosableResource()) {
      myResource.executeTask();
    } catch (Exception e) {
      log.error(e.getMessage(), e);
    }
  }

  private void nonAutoClosableResource() {
    @Cleanup("dispose")
    MyDisposableResource myResource = new MyDisposableResource();
    myResource.executeTask();
  }

}
