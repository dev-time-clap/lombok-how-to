package de.devtime.examples.lombok.tostring.komplex;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class AbstractTechnicalData {

  private String uuid;
  private int version;
  private LocalDateTime createDate;
  private String createdBy;
  private LocalDateTime updateDate;
  private String updatedBy;

}
