package de.devtime.examples.lombok.canequal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class MitarbeiterData extends PersonData {

  private String nummer;

  public MitarbeiterData(final String name, final String nummer) {
    super(name);
    this.nummer = nummer;
  }

}
