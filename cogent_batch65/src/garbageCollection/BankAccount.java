package garbageCollection;

import java.util.Scanner;

public class BankAccount {
int accNo;
String custName;
String accType;
float balance;

public BankAccount(int accNo, String custName, String accType, float balance) {
	super();
	this.accNo = accNo;
	this.custName = custName;
	this.accType = accType;
	this.balance = balance;
}

void deposit (float amt) throws NegativeAmount
{
	if(amt<0) {throw new NegativeAmount(" This is Negative amount");}
	else balance +=amt;
}

void withdraw (float amt) throws NegativeAmount,InsufficientFunds{
	if(amt<0) {throw new NegativeAmount(" This is Negative amount");}
	if (accType =="Current" && balance<1000) {throw new InsufficientFunds("Insufficient fund in current  ");}
	else if(accType =="Saving" && balance <1000)  {throw new InsufficientFunds("Insufficient fund <1000 in saving ");}
	else balance +=amt;
	
}

float getBalance() throws LowBalanceException, NegativeAmount{
	if (accType =="Saving" && balance <1000 && balance >0) {throw new LowBalanceException("Saving <1000"); }
	if (accType =="Current" && balance <5000 && balance >0) {throw new LowBalanceException("Current <5000"); }
	if (balance <0) throw new NegativeAmount("Account negative");
	return balance;
}

public static void main(String[] args) {
	
System.out.println("Bank account");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your balance");
	float balance = sc.nextFloat();
	BankAccount ba = new BankAccount(101, "Khoa" , "Saving ",balance);
	try {
		ba.getBalance();
	} catch (LowBalanceException e) {
		// TODO Auto-generated catch block
		System.out.println("Low balance");
		
	} catch (NegativeAmount e) {
		// TODO Auto-generated catch block
		System.out.println("Negative amount");
	}
	
	try {
		ba.withdraw(100);
	} catch (NegativeAmount e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InsufficientFunds e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		ba.deposit(100);
	} catch (NegativeAmount e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
