package com.controller;

import java.util.ArrayList;

import com.model.Account;
import com.service.AccountService;

public class AccountController {

	private AccountService accountService;

	public boolean addAccount(Account accountObj)
	{
		return false;
	}
	
	public Account viewAccountById(Integer accountId) {
	       return null;
	}

	public ArrayList<Account> viewAccountsByType(String accountType)
	{
		return null;
	}
		
	public boolean updateAccountBalance(Integer accountId,double balance)
	{
		return false;
	}
		
	public boolean deleteAccountInfo(Integer accountId) 
	{
		return false;
	}

}
