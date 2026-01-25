package de.devtime.examples.lombok.tostring.komplex;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Include;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
public abstract class AbstractTechnicalData {

  @Include(name = "id", rank = 10)
  private String uuid;
  @Include
  private int version;
  private LocalDateTime createDate;
  private String createdBy;
  private LocalDateTime updateDate;
  private String updatedBy;

}
