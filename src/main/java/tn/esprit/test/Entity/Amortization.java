package tn.esprit.test.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Amortization {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long idAmt;
    Long periode, startAmount, Intrest, amrt, annuty;
    @Enumerated(EnumType.STRING)
    typeAmort typeAmrt;


    @OneToOne(mappedBy = "amortization")
    @JsonIgnore
    RequestLoan requestloan;

}
