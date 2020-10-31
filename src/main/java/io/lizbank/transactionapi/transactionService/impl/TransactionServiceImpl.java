package io.lizbank.transactionapi.transactionService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import io.lizbank.transactionapi.entities.TransactionEntity;
import io.lizbank.transactionapi.mapper.TransactionMapper;
import io.lizbank.transactionapi.models.Transaction;
import io.lizbank.transactionapi.models.TransactionStatus;
import io.lizbank.transactionapi.models.TransactionStatusResponse;
import io.lizbank.transactionapi.repository.TransactionRepository;
import io.lizbank.transactionapi.utils.Constants;
import io.lizbank.transactionapi.utils.Util;

@Service
public class TransactionServiceImpl {

    @Autowired
    private TransactionRepository repository;

    public void saveTransaction(Transaction tr) {
        repository.save(transactionValidation(tr));
    }

    public List<Transaction> findAllByIban(String iban) {
        return TransactionMapper.getInstance().transactionsToOperations(repository.findByIbanOrderByAmountAsc(iban));
    }

    public TransactionStatusResponse findStatus(TransactionStatus status) {
        TransactionEntity transaction = repository.findByReferenceIs(status.getReference());

        if (transaction == null) {
            TransactionStatusResponse statusRes = new TransactionStatusResponse();
            statusRes.setReference(status.getReference());
            statusRes.setStatus(Constants.INVALID);
            return statusRes;
        }
        return buildResponseStatus(status.getChannel(), transaction);
    }

    private TransactionStatusResponse buildResponseStatus(String channel, TransactionEntity entity) {
        TransactionStatusResponse status = null;
        if (channel.equals(Constants.ATM) || channel.equals(Constants.CLIENT)) {
            status = new TransactionStatusResponse();
            status.setReference(entity.getReference());
            status.setAmount(new BigDecimal(entity.getAmount() - entity.getFee()));
            status.setStatus(getStatus(entity.getTransactionDate(), channel));
        } else if (channel.equals(Constants.INTERNAL)) {
            status = new TransactionStatusResponse();
            status.setReference(entity.getReference());
            status.setAmount(new BigDecimal(entity.getAmount()));
            status.setFee(new BigDecimal(entity.getFee()));
            status.setStatus(getStatus(entity.getTransactionDate(), channel));
        }else{
            status = new TransactionStatusResponse();
            status.setReference(entity.getReference());
            status.setAmount(new BigDecimal(entity.getAmount() - entity.getFee()));
            status.setStatus(Constants.INVALID);
        }
        return status;
    }

    private String getStatus(String date, String channel) {
        switch (Util.managementDate(date)) {
            case Constants.BEFORE_TODAY:
                return Constants.SETTLED;
            case Constants.TODAY:
                return Constants.PENDING;
            case Constants.AFTER_TODAY:
                if (!channel.equals(Constants.ATM)) {
                    return Constants.FUTURE;
                } else {
                    return Constants.PENDING;
                }
            default: return null;
        }
    }

    private TransactionEntity transactionValidation(Transaction tr) {
        if (tr.getTransactionDate() == null) {
            tr.setTransactionDate(LocalDateTime.now().toString());
        }
        if (tr.getReference() == null) {
            tr.setReference(generateReferenceNumber(tr));
        }
        return TransactionMapper.getInstance().transactionToOperation(tr);
    }

    private int generateReferenceNumber(Transaction operation) {
        return (Math.abs((operation.getTransactionDate() + operation.getIban() + operation.getAmount()).hashCode()));
    }

}

