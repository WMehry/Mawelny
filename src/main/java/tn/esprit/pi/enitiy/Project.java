package tn.esprit.pi.enitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  long idProject;
   String nomProject;
  String description;
  Float amount_inv;
  Date date_debut;
  Date date_fin;
 status Status_project;
  Float invest_value;
}
