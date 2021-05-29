/**
 * @author Omar Hamed Hashem Hamed
 *    ID : 20190349
 * @date 30/4/2021
 */
package task1;
import java.util.ArrayList;
public class Bank {
		String name;
	    String address;
	    long phone;
	    ArrayList <Account> Accounts=new ArrayList<Account>();
	    ArrayList <Client> Clients=new ArrayList<Client>();
	 public
	 
	     /**
	      *A parameterized   constructor that sets the values of the attributes
	      * @param name represents the bank's name.
	      * @param address represents the bank's address.
	      * @param phone represents the bank's phone number.
	      */
	 
	    Bank(String name, String address, long phone)
	     {
	        this.name = name;
	        this.address = address;
	        this.phone = phone;
	     }
	 
	 	/**
	 	 * a setter method for the attribute (name)
	 	 * @param name  attribute of the setter method
	 	 */

	    void setName(String name) 
		{
			this.name=name;
		}
	    
	    /**
	     * a getter method to get the value of the attribute (name)
	     * @return    it returns the value held in the variable (name)
	     */
	    
	    String getName() 
		{
			return name;
		}
	    
	    /**
	     * a setter method for the attribute (address)
	     * @param adress   attribute of the setter method
	     */
	    
	    void setAdresss(String adress) 
		{
			this.address=adress;
		}
	    
	    /**
	     * a getter method to get the value of the attribute (address)
	     * @return  it returns the value held in the variable (address)
	     */
	    
	    String getAdresss() 
		{
			return address;
		}
	    
	    /**
	     * a setter method for the attribute (phone)
	     * @param phone  attribute of the setter method
	     */
	    
	    void setPhone(long phone) 
		{
			this.phone=phone;
		}
	    
	    /**
	     * a getter method to get the value of the attribute (phone)
	     * @return  it returns the value held in the variable (phone)
	     */
	    
	    long getPhone() 

		{
			return phone;
		}
	    
	    /**
	     * A method that gives the user the ability to add his account
	     * @param account   a parameter of the function, which is an object of the class (Account)
	     */
	    
	    void addAccount (Account account) 
	    {
	    	Accounts.add(account);
	    }
	    
	    /**
	     * A method to display the accounts entered in the system
	     */
	    
	    void displayAccounts() 
	    {
	    	System.out.println(Accounts);
	    }
	    
	    /**
	     * A method that gives the user the ability to add himself as a client to the system
	     * @param client   a parameter of the function, which is an object of the class (Client)
	     */
	    
	    void addClient (Client client) 
	    {
	    	Clients.add(client);
	    }
	    
	    /**
	     * A method to display the clients added to the system
	     */
	    
	    void displayClients() 
	    {
	    	System.out.println(Clients);
	    }
}
