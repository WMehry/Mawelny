package tn.esprit.pi.enitiy;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Investment {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  long idInvestment;
  Float inv_amount;
  @Temporal(TemporalType.DATE)
  Date date_inevt;
  //Float income_by_day;
  @ManyToOne(cascade = CascadeType.ALL)
  Project project;
}
