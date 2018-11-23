package com.bazaar.accounts.models;

import com.bazaar.accounts.type.AccountType;

public abstract class AbstractAccount {

	private String name;
	private String email;
	private String address;
	private String phoneNumber;
	private AccountType accountType;
	
	public AbstractAccount(AccountType accountType) {
		super();
		this.accountType = accountType;
	}
	
	
	
	public AbstractAccount(String name, String email, String address, String phoneNumber, AccountType accountType) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.accountType = accountType;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
