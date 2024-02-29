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
public class Investment {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  long idPInvestment;
  Float inv_amount;
  Date date_inevt;
  Float income_by_day;

}
