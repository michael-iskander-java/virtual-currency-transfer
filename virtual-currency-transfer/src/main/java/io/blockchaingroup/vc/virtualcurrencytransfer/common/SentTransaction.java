package io.blockchaingroup.vc.virtualcurrencytransfer.common;

import java.util.Date;
import java.util.List;

public class SentTransaction {


	private double amount;

	private Date transactionDate;



	List<ReceivedTransactionItem> receivers;

	public SentTransaction() {
		super();
	}

	public SentTransaction(double amount, Date transactionDate, List<ReceivedTransactionItem> receivers) {
		super();
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.receivers = receivers;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public Date getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}



	public List<ReceivedTransactionItem> getReceivers() {
		return receivers;
	}


	public void setReceivers(List<ReceivedTransactionItem> receivers) {
		this.receivers = receivers;
	}







}