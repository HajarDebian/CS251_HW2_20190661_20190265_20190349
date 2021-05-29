/**
 * @author Hajar Mahmoud Mohammed Debian
 *         ID: 20190661
 * @date 30/4/2021
 */

package task1;


public class Client {
	
	private
		String name;
		long nationalID;
		String address;
		long phone;
		Account account;
		
	public
	
	/**
	 * an empty default constructor just to match the default constructor in 
	 * the derived class (CommercialClient), and to prevent errors  
	 */
	Client()
	{
		
	}
		
	/**
	 * A parameterized constructor that sets the values of the attributes
	 * @param name        represents the name of the client
	 * @param nationalID  represents the national ID of the client
	 * @param address     represents the address of the client 
	 * @param phone       represents the phone number of the client
	 * @param account     the client's account
	 */
	
	Client(String name, long nationalID, String address, long phone, Account account) 
	{
		this.name= name;
		this.nationalID= nationalID;
		this.address= address;
		this.phone= phone;
		this.account=account;
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
	 * a setter method for the attribute (nationalID)
	 * @param nationalID   attribute of the setter method 
	 */
	
	void setNationalID(long nationalID) 
	{
		this.nationalID= nationalID;
	}
	
	/**
	 * a getter method to get the value of the attribute (nationalID)
	 * @return   it returns the value held in the variable (nationalID)
	 */
	
	long getNationalID() 
	{
		return nationalID;
	}
	
	/**
	 * a setter method for the attribute (address)
	 * @param address  attribute of the setter method
	 */
	
	void setAddress(String address) 
	{
		this.address= address;
	}
	
	/**
	 * a getter method to get the value of the attribute (address)
	 * @return   it returns the value held in the variable (address)
	 */
	
	String getAddress() 
	{
		return address;
	}
	
	/**
	 * a setter method for the attribute (phone)
	 * @param phone  attribute of the setter method
	 */
	
	void setPhone(long phone) 
	{
		this.phone= phone;
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
	 * a setter method for the attribute (account)
	 * @param account  attribute of the setter method
	 */
	
	void setAccount(Account account) 
	{
		this.account=account;
	}
	
	/**
	 * a getter method to get the value of the attribute (account)
	 * @return   it returns the value held in the variable (account)
	 */
	
	Account getAccount() 
	{
		return account;
	}
	
	/**
	 * overriding the built in function (toString), to display the data of the client
	 */
	
	public String toString() 
	{
		return "Client's Information: "
				+"Name: "+getName()
				+"National ID: "+ getNationalID()
				+"Address: "+getAddress()
				+"Phone Number : "+getPhone()
				+"Client's Account: "+getAccount();
	}
		
		


}