package io.blockchaingroup.vc.virtualcurrencytransfer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import io.blockchaingroup.vc.virtualcurrencytransfer.dao.DaoService;
import io.blockchaingroup.vc.virtualcurrencytransfer.model.Account;


@Component
public class AccruingVCTask {

	@Autowired
	private DaoService service;

	private static final Logger log = LoggerFactory.getLogger(AccruingVCTask.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 1800000)
	public void accrueVirtualCurrency() {
		log.info("Accruing Virtual Currency: ", dateFormat.format(new Date()));
		List<Account> accounts = service.getAllAccounts();

		for (Account account : accounts) {

			double currentVc = account.getVc();

			double accruingVc = currentVc + 0.25;

			account.setVc(accruingVc);

			service.updateAccount(account);


		}

	}



}