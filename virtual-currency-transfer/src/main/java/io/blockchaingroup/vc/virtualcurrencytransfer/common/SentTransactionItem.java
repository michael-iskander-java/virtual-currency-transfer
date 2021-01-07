package io.blockchaingroup.vc.virtualcurrencytransfer.common;

import java.util.Date;

public class SentTransactionItem {

	private String userName;
	private String userId;
	private String email;
	private double amount;
	private Date transactionDate;


	public SentTransactionItem() {
		super();
	}


	public SentTransactionItem(String userName, String userId, String email, double amount, Date transactionDate) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.email = email;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
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







}
