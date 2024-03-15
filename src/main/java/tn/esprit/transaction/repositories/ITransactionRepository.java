package tn.esprit.transaction.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.transaction.entities.Transaction;


public interface ITransactionRepository extends JpaRepository<Transaction,Integer> {

}
