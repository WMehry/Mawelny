package tn.esprit.transaction.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_transaction;

    private Integer sender;
    private Integer receiver;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_transaction", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date date_transaction;

    @Enumerated(EnumType.STRING)
    private Type_transaction type;

    private Float value;

    @Enumerated(EnumType.STRING)
    private Status_Tr status;
    @PrePersist
    protected void onCreate() {
        date_transaction = new Date();
    }

}
