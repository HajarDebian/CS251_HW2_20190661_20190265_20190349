/**
 * @author shehab eldin ahmed sabry
 * id:20190265
 * @date 30/4/2021
 */
package task1;

public class SpecialAccount extends Account{
	/**
	 * overriding the (withdraw)function to add the feature that allows the client to withdraw extra1000
	 * @param withdraw the value that the client wants to take
	 */
	public
	void withdraw(double withdraw) {
		
		if(withdraw<getBalance()-1000.0){
			
		setBalance(getBalance()-withdraw);
		}
		else {
			System.out.println("this process can't be completed");
		}
	}


}
