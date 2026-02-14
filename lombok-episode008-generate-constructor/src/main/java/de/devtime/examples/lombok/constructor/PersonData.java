package de.devtime.examples.lombok.constructor;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Getter
public class PersonData {

  private final String firstname;
  private final String lastname;
  private final String nickname;
  private final LocalDate birthday;

}
