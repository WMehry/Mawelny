package tn.esprit.pi.enitiy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;
import java.util.Set;

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
 // @NotBlank(message = "Le nom ne peut pas être vide")
   String nomProject;
  String description;
  Float amount_inv;
  Float invest_value;
  Float prixAction;
  @Temporal(TemporalType.DATE)
  Date date_debut;
  @Temporal(TemporalType.DATE)
  Date date_fin;
 statusProject Status_project;
  statusInvest Status_Invest;
  @Lob
  private byte[] Businessplan;




  @OneToMany(mappedBy = "project")
  @JsonIgnore
 Set <Investment> investments;


}
