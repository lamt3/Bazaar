package com.bazaar.accounts.models;

import org.springframework.stereotype.Component;

import com.bazaar.accounts.type.AccountType;

@Component
public class VendorAccount extends AbstractAccount implements Account {

	public VendorAccount(AccountType accountType) {
		super(accountType);
		// TODO Auto-generated constructor stub
	}

	private String id;
	


	
	
}
