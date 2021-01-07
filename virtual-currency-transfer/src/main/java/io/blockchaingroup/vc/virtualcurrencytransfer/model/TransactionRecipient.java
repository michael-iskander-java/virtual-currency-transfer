package io.blockchaingroup.vc.virtualcurrencytransfer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TransactionRecipient {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transactionrecipient_id")
	private long id;

	@ManyToOne
	@JoinColumn(name="transaction_id", nullable=false)
	private Transaction transaction;

	private String userId;

	private double amount;



	public TransactionRecipient(long id, Transaction transaction, String userId, double amount) {
		super();
		this.id = id;
		this.transaction = transaction;
		this.userId = userId;
		this.amount = amount;
	}

	public TransactionRecipient() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public Transaction getTransaction() {
		return transaction;
	}


	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}



}