/*
 *	Author:  Miller Robb 
 *  Date: 10/20/26
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
		owner="";
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

}