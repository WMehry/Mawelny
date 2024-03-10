package tn.esprit.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.test.Entity.OfferLoan;

@Repository
public interface OfferLoanRepository extends JpaRepository<OfferLoan,Long> {
}
