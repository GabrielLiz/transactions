package io.lizbank.transactionapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import io.lizbank.transactionapi.entities.TransactionEntity;

@Repository
public interface  TransactionRepository  extends JpaRepository<TransactionEntity, String> {

    List<TransactionEntity> findByIbanIs(String iban);

    TransactionEntity findByReferenceIs(int reference);

    List<TransactionEntity> findByIbanOrderByAmountAsc(String name);


}

