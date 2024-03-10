package tn.esprit.test.Entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OfferLoan {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long idOffer;
    Long maxAmnt, minAmnt, MinRepaymentPer;
    Float intRate;
    @Temporal(TemporalType.DATE)
    Date offrDate;
    @Enumerated(EnumType.STRING)
    LoanType typeLoan;


    @ManyToMany
    Set<RequestLoan> requestloans;


/*
    @OneToMany(mappedBy = "offerLoan")
    Set<User> user;
*/


}
