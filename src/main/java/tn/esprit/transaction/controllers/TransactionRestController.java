package tn.esprit.transaction.controllers;



import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.transaction.entities.Transaction;
import tn.esprit.transaction.services.TransactionService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Transaction")
public  class TransactionRestController {
    private TransactionService transactionService;

    @PostMapping("/add")
    Transaction AddTransaction(@RequestBody Transaction transaction){
        return transactionService.AddTransaction(transaction);
    }
    @GetMapping("/all")
    List<Transaction> retrieveAllTransactions(){
        return  transactionService.retrieveAllTransactions();
    }
    @GetMapping("/get/{id}")
    Transaction retrieveTransaction(@PathVariable("id") Integer id_transaction){
        return transactionService.retrieveTransaction(id_transaction);
    }
    @DeleteMapping("/delete/{id}")
    void removeTransaction(@PathVariable("id") Integer id_transaction){
        transactionService.removeTransaction(id_transaction);
    }
    @PutMapping("/update")
    Transaction updateTransaction(@RequestBody Transaction transaction){
        return transactionService.updateTransaction(transaction);
    }

}