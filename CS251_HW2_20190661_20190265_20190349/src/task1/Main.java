package task1;

public class Main {
	public static void main(String[] args) {
		Bank test;
		Account acc;
		test=new Bank("BankName","BankAdress",00000000000);
		String choice;
		    int deposit;
		    int withdraw;
		    boolean flag = true;

		    String accountType;
		    String currencyType;
		    int balance;
		 while(flag)
		 {
		      System.out.println("Select a choice: ");
		      System.out.println("1. Existing client");
		      System.out.println("2. Add New client");   
		      System.out.println("3. Quit");
		      Scanner sc= new Scanner(System.in);


		      String mainChoice= sc.nextLine();

		           
		      switch (mainChoice) {
		         case "1":
		             System.out.println("Enter clientID: ");
		             
		             System.out.println("Would you like to: ");
		             System.out.println("1. Deposit ");
		             System.out.println("2. Withdraw ");
		             System.out.println("3. Display account info ");
		             System.out.println("4. Check balance ");
		             choice = sc.nextLine();
		             switch (choice) {
		             	case "1":
		             		System.out.println("How much would you like to deposit?");
		             		deposit = sc.nextInt();
		             		acc.deposit(deposit);
		             		break;
		             	case "2":
		             		System.out.println("How much would you like to withdraw?");
		             		withdraw = sc.nextInt();
		             		acc.withdraw(withdraw);
		             		break;
		             	case "3":
		             		test.displayElements();
		             		break;
		             	case "4":
		             		acc.getBalance();
		             		break;
		             	default:
		             		System.out.println("Invalid");
		             		break;
		             }
		             break;
		         case "2":
		             //add new user to arraylist
		             
		             int newID = clientID + 1;
		             System.out.println("Enter account type: ");
		             accountType = in.next();
		             System.out.println("Enter currency type: ");
		             currencyType = in.next();
		             System.out.println("Enter initial balance: ");
		             balance = in.nextInt();
		             System.out.println("Your customer ID will be: " + newID);
		             Accounts.add(new Client(newID, accountType, currencyType, balance));
		             break;
		         case "3":
		             System.out.println("Thanks for using this bank!");
		             flag = false;
		             break;
		         default:
		             System.out.println("Invalid");
		             break;
		     }
		 }
		

	}
}
