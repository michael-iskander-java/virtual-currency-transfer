package io.blockchaingroup.vc.virtualcurrencytransfer.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.blockchaingroup.vc.virtualcurrencytransfer.model.Account;

@Repository
public interface AccountRepository<T> extends JpaRepository<Account, Long>{

	@Query("select a from Account a order by a.id Desc")
	List<Account> getAllAccounts();

	Account findByUserId(String userId);

}
