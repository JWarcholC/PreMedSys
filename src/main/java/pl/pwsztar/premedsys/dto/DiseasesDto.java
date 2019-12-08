package pl.pwsztar.premedsys.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Getter
public class DiseasesDto implements Serializable {

  String diseaseName;
  String diseaseLatinName;
}
