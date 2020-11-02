package io.lizbank.transactionapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;

import io.lizbank.transactionapi.api.SearchTrByIbanApi;
import io.lizbank.transactionapi.api.TransactionApi;
import io.lizbank.transactionapi.api.TransactionStatusApi;
import io.lizbank.transactionapi.models.Filters;
import io.lizbank.transactionapi.models.FindTransactionResponse;
import io.lizbank.transactionapi.models.Transaction;
import io.lizbank.transactionapi.models.TransactionStatus;
import io.lizbank.transactionapi.models.TransactionStatusResponse;
import io.lizbank.transactionapi.transactionService.impl.TransactionServiceImpl;

@RestController
public class TransactionController implements TransactionApi, TransactionStatusApi, SearchTrByIbanApi {

    @Autowired
    TransactionServiceImpl transactionService;

    @Override
    public ResponseEntity<Void> transaction(@Valid Transaction body) {
        transactionService.saveTransaction(body);
        return new ResponseEntity<>(null,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TransactionStatusResponse> transactionStatus(@Valid TransactionStatus body) {
        return new ResponseEntity<>(transactionService.findStatus(body), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<FindTransactionResponse> searchTransactions(@Valid Filters body) {
        FindTransactionResponse findTransactionResponse = new FindTransactionResponse();
        findTransactionResponse.setOperations(transactionService.findAllByIban(body.getIban(), body.getSortByAmount()));
        return new ResponseEntity<>(findTransactionResponse, HttpStatus.OK);
    }
}
