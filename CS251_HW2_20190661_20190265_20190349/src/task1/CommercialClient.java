/**
 * @author Hajar Mahmoud Mohammed Debian
 *         ID: 20190661
 * @date 30/4/2021
 */
package task1;


public class CommercialClient extends Client{
	
	private
		long commercialID;
	
	public
	
		/**
		 * a default constructor to set the initial value of the (nationalID) to zero
		 */
		CommercialClient() 
		{
		nationalID=00000000000000;
		}
	
		/**
		 * a setter method for the attribute (commercialID)
		 * @param commercialID  the commercial ID of the company
		 */
	
		void setCommercialID(long commercialID) 
		{
			this.commercialID= commercialID;
		}
		
		/**
		 *  a getter method to get the value of the attribute (commercialID)
		 * @return   it returns the value held in the variable (commercialID)
		 */
		
		long getCommercialID() 
		{
			return commercialID;
		}
		
		/**
		 * overriding the built in function (toString), to display the data of the company
		 */
		
		public String toString() 
		{
			return"Commercial Client's Information: "
					+"Name: "+ getName()
					+"Commercial ID: "+ getCommercialID() 
					+"Address"+ getAddress()
					+"Phone Number: "+ getPhone()
					+"Company's Account: "+ getAccount();
		}
}