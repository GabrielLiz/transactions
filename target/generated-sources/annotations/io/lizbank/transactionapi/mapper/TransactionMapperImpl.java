package io.lizbank.transactionapi.mapper;

import io.lizbank.transactionapi.entities.TransactionEntity;
import io.lizbank.transactionapi.models.Transaction;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-11-14T16:51:12+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.9.1 (Ubuntu)"
)
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public TransactionEntity transactionToOperation(Transaction idto) {
        if ( idto == null ) {
            return null;
        }

        TransactionEntity transactionEntity = new TransactionEntity();

        if ( idto.getReference() != null ) {
            transactionEntity.setReference( idto.getReference() );
        }
        if ( idto.getAmount() != null ) {
            transactionEntity.setAmount( idto.getAmount().floatValue() );
        }
        transactionEntity.setIban( idto.getIban() );
        if ( idto.getFee() != null ) {
            transactionEntity.setFee( idto.getFee().floatValue() );
        }
        transactionEntity.setDescription( idto.getDescription() );
        transactionEntity.setTransactionDate( idto.getTransactionDate() );

        return transactionEntity;
    }

    @Override
    public List<Transaction> transactionsToOperations(List<TransactionEntity> idto) {
        if ( idto == null ) {
            return null;
        }

        List<Transaction> list = new ArrayList<Transaction>( idto.size() );
        for ( TransactionEntity transactionEntity : idto ) {
            list.add( transactionEntityToTransaction( transactionEntity ) );
        }

        return list;
    }

    protected Transaction transactionEntityToTransaction(TransactionEntity transactionEntity) {
        if ( transactionEntity == null ) {
            return null;
        }

        Transaction transaction = new Transaction();

        transaction.setReference( transactionEntity.getReference() );
        transaction.setIban( transactionEntity.getIban() );
        transaction.setTransactionDate( transactionEntity.getTransactionDate() );
        transaction.setAmount( BigDecimal.valueOf( transactionEntity.getAmount() ) );
        transaction.setFee( BigDecimal.valueOf( transactionEntity.getFee() ) );
        transaction.setDescription( transactionEntity.getDescription() );

        return transaction;
    }
}
