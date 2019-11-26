package pl.pwsztar.premedsys.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "diseases_symptomes")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
class DiseasesSymptomes {

  @Id
  @Column(name = "disease_symptomes_id")
  Long diseaseSymptomesId;

  //TODO: one to many
  @Column(name = "disease_id")
  Long diseaseId;

  @Column(name = "symptomes_content")
  String symptome;
}
