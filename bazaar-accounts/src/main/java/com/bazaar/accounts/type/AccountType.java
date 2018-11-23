package com.bazaar.accounts.type;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum AccountType {
	VENDOR ("vendor"),
	RESTAURAUNT ("restaurant");
	
	private String text;
	
	AccountType(String text){
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
	
	@JsonCreator 
	public static AccountType fromString(String text) {
		for(AccountType a : AccountType.values()) {
			if(a.text.equalsIgnoreCase(text)) {
				return a;
			}
		}
		return null;
	}
}
