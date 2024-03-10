package tn.esprit.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.test.Entity.RequestLoan;
@Repository
public interface RequestLoanRepository extends JpaRepository<RequestLoan,Long> {
}
