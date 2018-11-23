package com.bazaar.accounts.models;

import com.bazaar.accounts.type.AccountType;

public class CreateVendorAccount extends AbstractAccount implements Account {
	
	private String password;
	private String confirmPassword;
	
	public CreateVendorAccount(String name, String address, String phoneNumber, AccountType accountType, String email, String password, String confirmPassword) {
		super(name, email, address, phoneNumber, accountType);
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

}
