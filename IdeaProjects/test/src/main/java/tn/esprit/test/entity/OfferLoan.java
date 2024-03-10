package tn.esprit.test.entity;


import jakarta.persistence.*;

import java.util.Date;

public class OfferLoan {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long OferID;
    Float Interest_rate;
    Long MaxAmount;
    Long MinAmount;
    Date OfferDate;
    Long MinRepaymentPer;
    @Enumerated(EnumType.STRING)
    LoanType loanType;

    
}
