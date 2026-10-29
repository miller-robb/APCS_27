/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	private int accountNumber;
	private String owner;
	private double balance;
	private boolean isActive;
	private static int nextAccountNumber=(int)(Math.random()*950)+50;
	
		
		
	



	// -------CONSTRUCTORS-------
	public BankAccount(){
		accountNumber=nextAccountNumber;
		nextAccountNumber=nextAccountNumber+1;
		owner="Unknown";
		balance=0.0;
		isActive=true;
		
	}

	

	// -------METHODS-------
	public BankAccount(String name){
		accountNumber=nextAccountNumber;
		nextAccountNumber=nextAccountNumber+1;
		owner=name;
		balance=0.0;
		isActive=true;
	}
	public BankAccount(String name,double deposit){
		accountNumber=nextAccountNumber;
		nextAccountNumber=nextAccountNumber+1;
		owner=name;
		balance=0.0+deposit;
		isActive=true;
	}
	
	// -------METHODS-------
	public void displayAccountInfo(){
		System.out.println("Owner: "+owner);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Account: "+isActive);
	}
	public double getBalance(){
		
		return balance;
	}
	public void checkBalance(){
		System.out.println("Current balance: "+balance);
	}
	public void infoIntoString(){
		System.out.println("Name: "+owner);
		System.out.println("Balance: "+balance);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Account Activated: Active");
	}
	public String getOwner(){
		return owner;
	}
	public void setOwner(String name){
		owner=name;
	}
	public void closeAccount(){
		isActive=false;
	}
	public boolean isActive(){
		return isActive;
	}
	public void deposit(double deposit){
		if(isActive){
			balance=balance+deposit;

		}
		else{
			System.out.println("Sorry this account is not active");
		}
		
	}
	public void withdraw(double withdraw){
		if(isActive&&withdraw<=balance){
			balance=balance-withdraw;
			
		}
		else if(isActive){
			System.out.println("Sorry this account has insufficent funds");

		}
		else if(withdraw<=balance){
			System.out.println("Sorry this account is not active");
		}
		else{
			System.out.println("Sorry this account is inactive and has insuffcient funds");
		}
	}
	

	// -------GLOBAL VARIABLES-------
	



	// -------CONSTRUCTORS-------
	
	

	// -------METHODS-------

}