package io.blockchaingroup.vc.virtualcurrencytransfer.model;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import javax.persistence.Column;


@Entity
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="account_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	private long id;

	private String userName;

	private String email;

	@JsonProperty(access = Access.WRITE_ONLY)
	private String passowrd;

	private String userId;

	private double vc;

	private Date createdDate;

	@OneToMany(mappedBy="sender")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Transaction> transactions;

	public Account() {

	}


	public Account(long id, String userName, String email, String passowrd, String userId, double vc, Date createdDate, List<Transaction> transactions) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.passowrd = passowrd;
		this.userId = userId;
		this.vc = vc;
		this.createdDate = createdDate;
		this.transactions = transactions;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassowrd() {
		return passowrd;
	}


	public List<Transaction> getTransactions() {
		return transactions;
	}



	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}


	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public double getVc() {
		return vc;
	}



	public void setVc(double vc) {
		this.vc = vc;
	}



	public Date getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}



}