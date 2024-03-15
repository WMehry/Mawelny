package tn.esprit.transaction.services;



import tn.esprit.transaction.entities.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> retrieveAllTransactions();
    Transaction AddTransaction(Transaction transaction);
    void removeTransaction(Integer numTransaction);
    Transaction retrieveTransaction(Integer numTransaction);
    Transaction updateTransaction(Transaction transaction);

}
