/**
 * @author shehab eldin ahmed sabry
 * id:20190265
 * @date 30/4/2021
 */
package task1;

public class Account {
	 double balance;
	 long accountNumber;
	 public
	 
	 /**
	  *An empty constructor that initial values to the attributes
	  */
	 
	 Account(){
		 this.accountNumber=00000000;
		 this.balance=0.0;
	 }
	 
	 /**
	  * getter for the attribute(AccountNumber)
	  * @return it returns the value in the variable
	  */
	 
	 long getAccountNumber(){
		 return this.accountNumber;
	 }
	 
	 /**
	  * setter for the attribute(AccountNumber)
	  * @param accountNumber attribute of the setter method
	  */
	 
	 void setAccountNumber(long accountNumber) {
		  this.accountNumber= accountNumber;
	 }
	 
	 /**
	  * getter for the attribute(Balance)
	  * @return it returns the value in the variable
	  */
	 
	 double getBalance(){
			 return this.balance;
	 } 
	 
	 /**
	  * setter for the attribute(Balance)
	  * @param balance attribute of the setter method
	  */
	 
	 void setBalance(double balance)
	 {
			  this.balance=balance;
	 }
	 
	 /**
	  * this function checks whether there is enough balance or not so as to give it to the client 
	  * @param withdraw the value that the client wants to take
	  */
	 
	 void withdraw(double withdraw)
	 {	 
		 
		 /**
		  * if statement checks whether there is enough balance or not
		  */
		 
		 if(withdraw<balance)
		 {
			 System.out.println("There is no enough balance");
		 }
		 
		 /**
		  * else statement adds the value of withdraw to the balance
		  */
		 
		 else 
		 {
			 this.balance-=withdraw;
		 }
		 
	 }
	 
	 /**
	  * this function adds to the balance the value that the client deposited 
	  * @param deposit the value that the client wants to take
	  */
	 
	 void deposit(double deposit)
	 {
		 
			 this.balance+=deposit;
	 }
	 
	 /**
	  * overriding the (to string) to display the data of the account 
	  */
	 
	public String toString() 
	{
		return "Account information: "
				+ "Account balance: "+getBalance()
				+ "Account number: "+getAccountNumber();
				
	}

}
