package io.blockchaingroup.vc.virtualcurrencytransfer.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import javax.validation.Valid;
import io.blockchaingroup.vc.virtualcurrencytransfer.common.AccountDO;
import io.blockchaingroup.vc.virtualcurrencytransfer.common.ReceivedTransaction;
import io.blockchaingroup.vc.virtualcurrencytransfer.common.RecipientAccount;
import io.blockchaingroup.vc.virtualcurrencytransfer.common.SentTransaction;
import io.blockchaingroup.vc.virtualcurrencytransfer.dao.DaoService;
import io.blockchaingroup.vc.virtualcurrencytransfer.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
public class VCController {


	@Autowired
	private DaoService service;

	@PostMapping("/addaccount")
	public String createAccount(@Valid@RequestBody AccountDO account) throws Exception {

		Account savedAccount = service.addAccount(account);

		return "New account has been created with id: "+savedAccount.getUserId();

	}

	@GetMapping("/accounts")
	public List<Account> retrieveAllAccounts() {
		return service.getAllAccounts();
	}

	@PostMapping("/sendVc")
	public String sendVc(@RequestHeader(name = "user-id") String userId, @RequestBody List<RecipientAccount> recipientAccounts) throws Exception{

		if (recipientAccounts.size()>10) {
			throw new Exception("Transaction to more than 10 accounts is not allowed.");
		}

		return service.doTransaction(userId,recipientAccounts);

	}

	@GetMapping("/sentTransactions")
	public List<SentTransaction> retrieveSentTransactions(@RequestHeader(name = "user-id") String sentUserId){

		List<SentTransaction> response = service.getSentTransactions(sentUserId);

		return response;
	}


	@GetMapping("/receivedTransactions")
		public ReceivedTransaction retrieveReceivedTransactions(@RequestHeader(name = "user-id") String receivedUserId){

		ReceivedTransaction response = service.getReceivedTransactions(receivedUserId);

		return response;

	}

}