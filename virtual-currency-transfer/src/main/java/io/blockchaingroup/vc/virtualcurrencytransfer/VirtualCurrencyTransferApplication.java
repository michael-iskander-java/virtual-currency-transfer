package io.blockchaingroup.vc.virtualcurrencytransfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class VirtualCurrencyTransferApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualCurrencyTransferApplication.class, args);
	}

}
