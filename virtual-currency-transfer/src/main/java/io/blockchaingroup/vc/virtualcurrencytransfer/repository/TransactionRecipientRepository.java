package io.blockchaingroup.vc.virtualcurrencytransfer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import io.blockchaingroup.vc.virtualcurrencytransfer.model.TransactionRecipient;


public interface TransactionRecipientRepository<T> extends JpaRepository<TransactionRecipient, Long> {

	List<TransactionRecipient> findByUserId(String userId);
}
