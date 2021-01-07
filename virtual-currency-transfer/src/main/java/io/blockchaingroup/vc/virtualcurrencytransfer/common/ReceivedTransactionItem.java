package io.blockchaingroup.vc.virtualcurrencytransfer.common;


public class ReceivedTransactionItem {


	private String userName;
	private String userId;
	private String email;
	private double amount;

	public ReceivedTransactionItem() {
		super();
	}

	public ReceivedTransactionItem(String userName, String userId, String email, double amount) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.email = email;
		this.amount = amount;
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


}
