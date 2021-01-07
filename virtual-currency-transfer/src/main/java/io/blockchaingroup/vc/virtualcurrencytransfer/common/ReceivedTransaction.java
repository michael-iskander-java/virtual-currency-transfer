package io.blockchaingroup.vc.virtualcurrencytransfer.common;

import java.util.List;

public class ReceivedTransaction {


	private double amount;

	List<SentTransactionItem> senders;




	public ReceivedTransaction() {
		super();
	}



	public ReceivedTransaction(double amount, List<SentTransactionItem> senders) {
		super();
		this.amount = amount;
		this.senders = senders;
	}



	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public List<SentTransactionItem> getSenders() {
		return senders;
	}


	public void setSenders(List<SentTransactionItem> senders) {
		this.senders = senders;
	}




}
