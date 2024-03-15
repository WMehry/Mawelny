package tn.esprit.transaction.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.transaction.entities.Transaction;
import tn.esprit.transaction.repositories.ITransactionRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService{
    private ITransactionRepository ItransactionRepository;
    @Override
    public List<Transaction> retrieveAllTransactions(){
        return ItransactionRepository.findAll();
    }
    @Override
    public Transaction AddTransaction(Transaction transaction){
        return  ItransactionRepository.save(transaction);
    }
    @Override
   public void removeTransaction(Integer numTransaction){
        ItransactionRepository.deleteById(numTransaction);
   }
   @Override
    public Transaction retrieveTransaction(Integer numTransaction){
        return ItransactionRepository.findById(numTransaction).orElse(null);
    }
    @Override
    public Transaction updateTransaction(Transaction transaction){
        return ItransactionRepository.save(transaction);
    }

}
