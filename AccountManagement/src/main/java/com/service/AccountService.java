package com.service;

import java.util.ArrayList;

import com.model.Account;


public class AccountService {
	
	private ArrayList<Account> accountList=new ArrayList<Account>();
	
	public ArrayList<Account> getAccountList() {
		return accountList;
	}


	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

	public AccountService()
	{
		Account accObj1=new Account(1000,"John","Savings",10000);
		Account accObj2=new Account(2000,"Peter","Current",20000);
		Account accObj3=new Account(3000,"Rose","Current",9000);
		Account accObj4=new Account(4000,"Pinky","Savings",5000);
		Account accObj5=new Account(5000,"Praneeth","Savings",7500);
		Account accObj6=new Account(6000,"Anand","Current",2500);
		Account accObj7=new Account(7000,"Ashwin","Savings",2000);
		
		accountList.add(accObj1);
		accountList.add(accObj2);
		accountList.add(accObj3);
		accountList.add(accObj4);
		accountList.add(accObj5);
		accountList.add(accObj6);
		accountList.add(accObj7);		
	}
	
	
	public boolean addAccount(Account accountObj)
	{
		return false;
	}
	
	public Account viewAccountById(int accountId) {
	       return null;
	}

	public ArrayList<Account> viewAccountsByType(String accountType)
	{
		return null;
	}
		
	public boolean updateAccountBalance(int accountId,double balance)
	{
		return false;
	}
		
	public boolean deleteAccountInfo(int accountId) 
	{
		return false;
	}
	
}
