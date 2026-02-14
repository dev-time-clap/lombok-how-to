package de.devtime.examples.lombok.constructor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EmployeeData extends PersonData {

  private final String number;

}
