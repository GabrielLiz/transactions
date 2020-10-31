package io.lizbank.transactionapi.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

import io.lizbank.transactionapi.entities.TransactionEntity;
import io.lizbank.transactionapi.models.Transaction;

@Mapper
public interface TransactionMapper {
    static TransactionMapper getInstance() {
        return Mappers.getMapper(TransactionMapper.class);
    }

    @Mappings({

            @Mapping(source = "reference", target = "reference"),
            @Mapping(source = "iban", target = "iban"),
            @Mapping(source = "transactionDate", target = "transactionDate"),
            @Mapping(source = "amount", target = "amount"),
            @Mapping(source = "fee", target = "fee"),
            @Mapping(source = "description", target = "description")
    })
    @Named("operToTran")
    TransactionEntity transactionToOperation(Transaction idto);

    @IterableMapping(qualifiedByName = "operToTran")
    List<Transaction> transactionsToOperations(List<TransactionEntity> idto);

}
