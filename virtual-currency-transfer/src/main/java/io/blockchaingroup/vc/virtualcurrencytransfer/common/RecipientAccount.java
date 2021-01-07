package io.blockchaingroup.vc.virtualcurrencytransfer.common;


public class RecipientAccount {



	private String userId;

	private double transferredAmount;



	public RecipientAccount() {
		super();
	}



	public RecipientAccount(String userId, double transferredAmount) {
		super();
		this.userId = userId;
		this.transferredAmount = transferredAmount;
	}




	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
	}




	public double getTransferredAmount() {
		return transferredAmount;
	}




	public void setTransferredAmount(double transferredAmount) {
		this.transferredAmount = transferredAmount;
	}





}
