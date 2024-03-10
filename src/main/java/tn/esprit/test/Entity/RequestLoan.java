package tn.esprit.test.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="request_loans")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RequestLoan implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long requestId;
    @Temporal(TemporalType.DATE)//timestamp for the hours
    Date reqDate;
    @Enumerated(EnumType.STRING)
    StatLoan status;
    Float loanAmnt;
    Long nbrMonth, nbrYears;
    @Lob
    byte[] garantor;


    @ManyToMany(mappedBy = "requestloans")
    Set<OfferLoan> offerloan;

    @OneToOne(cascade = CascadeType.ALL)
    Amortization amortization;

}
