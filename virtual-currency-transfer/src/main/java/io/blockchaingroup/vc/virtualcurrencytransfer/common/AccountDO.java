package io.blockchaingroup.vc.virtualcurrencytransfer.common;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class AccountDO {

	@Size(min=2, message="Name should have at least 2 characters.")
	private String userName;

	@Email(message = "Email must be a valid email.")
	@NotEmpty(message = "You have to enter a valid email.")
	private String email;

	@Size(min=8, message="Password should have at least 8 characters.")
	private String passowrd;

	public AccountDO() {
		super();
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


	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}



}