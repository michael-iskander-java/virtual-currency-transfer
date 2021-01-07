package io.blockchaingroup.vc.virtualcurrencytransfer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.PAYMENT_REQUIRED)
public class InsufficientFundException extends RuntimeException {
	public InsufficientFundException(String message) {
		super(message);
	}

}
