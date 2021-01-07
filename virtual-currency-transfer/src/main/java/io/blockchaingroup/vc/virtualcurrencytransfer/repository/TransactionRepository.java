package io.blockchaingroup.vc.virtualcurrencytransfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.blockchaingroup.vc.virtualcurrencytransfer.model.Transaction;

@Repository
public interface TransactionRepository<T> extends JpaRepository<Transaction, Long> {

}
