/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
		// -------GLOBAL VARIABLES-------
	private int accountNumber;
	private String owner;
	private int balance;
	private boolean isActive;
	private static int nextAccountNumber=(int)(Math.random()*950)+50;
	
		
		
	



	// -------CONSTRUCTORS-------
	public BankAccount(){
		accountNumber=nextAccountNumber;
		nextAccountNumber=nextAccountNumber+1;
		owner="Unknown";
		balance=0;
		isActive=true;
		
	}

	

	// -------METHODS-------
	public BankAccount(String name){
		accountNumber=nextAccountNumber;
		nextAccountNumber=nextAccountNumber+1;
		owner=name;
		balance=0;
		isActive=true;
	}
	public BankAccount(String name,int deposit){
		accountNumber=nextAccountNumber;
		nextAccountNumber=nextAccountNumber+1;
		owner=name;
		balance=0+deposit;
		isActive=true;
	}
	
	// -------METHODS-------
	public int returnBalance(){
		return balance;
	}
	public void infoIntoString(){
		System.out.println("Name: "+owner);
		System.out.println("Balance: "+balance);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Account Activated: Active");
	}

}