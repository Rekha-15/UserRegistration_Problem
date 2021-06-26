/***********************************************************************************************
 *@purpose Implementing User Registration Program .
 *@author Rekha
 *@version 1.0
 *@since 18-06-2021
 ************************************************************************************************/

package com.UserRegistration;
// customized Exception
public class UserDefinedException extends Exception {
	
    public String errormessage;
    
    //Initializing Constructor
	public UserDefinedException(String message) {
		this.errormessage = message;	
	}
}