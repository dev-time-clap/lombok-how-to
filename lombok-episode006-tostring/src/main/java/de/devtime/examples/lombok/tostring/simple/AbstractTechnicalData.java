package de.devtime.examples.lombok.tostring.simple;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class AbstractTechnicalData {

  private String uuid;
  private int version;

}
