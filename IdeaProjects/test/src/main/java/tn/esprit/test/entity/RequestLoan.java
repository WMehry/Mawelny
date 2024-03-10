package tn.esprit.test.entity;

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
public class RequestLoan {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long ReqID;
    Date ReqDate;
    String Desc;
    Float LoanAmount;
    Long RepaymntMonth;
    Long InterestAmount;
    String Garantor;
    Long RestToPay;

    @Enumerated(EnumType.STRING)
    TypeStat StatLoan;



}
