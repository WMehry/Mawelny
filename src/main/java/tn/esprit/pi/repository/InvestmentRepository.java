package tn.esprit.pi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pi.enitiy.Investment;

@Repository
public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}
