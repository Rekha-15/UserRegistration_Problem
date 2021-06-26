/***********************************************************************************************
 *@purpose Implementing User Registration Program .
 *@author Rekha
 *@version 1.0
 *@since 18-06-2021
 ************************************************************************************************/

package com.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	/**
	 * @param NAME_PATTERN         contain the correct pattern for First name and
	 *                             last name
	 * @param EMAIL_PATTERN        contain the email
	 * @param PHONE_NUMBER_PATTERN contain the correct pattern for phone number
	 * @param PASSWORD_PATTERN     contain the pattern for password
	 */
	private final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,10}$";
	private final String EMAIL_PATTERN = "^[a-zA-Z0-9]{1,}[[.|+|-]a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2,3})*$";
	private final String PHONE_NUMBER_PATTERN = "[0-9]{2}[\\s][0-9]{10}$";
	private final String PASSWORD_PATTERN = ("^(?=.*[@#$%^&+=])(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$");

	/**
	 * Uc1:
	 * 
	 * @method validateFirstName Check the pattern for first name
	 * @return boolean this returns true/false based on the firstname test result
	 * @throws UserDefinedException
	 */
	public boolean validateFirstName(String firstName) throws UserDefinedException {

		Pattern pattern = Pattern.compile(NAME_PATTERN);
		Matcher matcher = pattern.matcher(firstName);
		if (!matcher.matches()) {
			throw new UserDefinedException("Enter a valid pattern");
		}
		return matcher.matches();
	}

	/**
	 * Uc2:
	 * 
	 * @method validateLastName Check the pattern for first name
	 * @return boolean this returns true/false based on the firstname test result
	 * @throws UserDefinedException
	 */

	public boolean validateLastName(String lastName) throws UserDefinedException {
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		Matcher matcher = pattern.matcher(lastName);
		if (!matcher.matches()) {
			throw new UserDefinedException("Enter a valid pattern");
		}
		return matcher.matches();
	}

	/**
	 * Uc3 and Uc9:
	 * 
	 * @method validateEmail Check the pattern for email
	 * @return boolean this returns true/false based on the email test result
	 * @throws UserDefinedException
	 */

	public boolean validateEmail(String email) throws UserDefinedException {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		if (!matcher.matches()) {
			throw new UserDefinedException("Enter a valid pattern");
		}
		return matcher.matches();
	}

	/**
	 * Uc4:
	 * 
	 * @method validatePhoneNumber Check the pattern for Phone Number
	 * @return boolean this returns true/false based on the phoneNumber test result
	 * @throws UserDefinedException
	 */
	public boolean validatePhoneNumber(String phoneNumber) throws UserDefinedException {
		Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
		Matcher matcher = pattern.matcher(phoneNumber);
		if (!matcher.matches()) {
			throw new UserDefinedException("Enter a valid pattern");
		}
		return matcher.matches();
	}

	/**
	 * Uc5:
	 * 
	 * @method validatePassword Check the pattern for Password
	 * @return boolean this returns true/false based on the password test result
	 *         Rule 1: Should contain atleast 8 character Uc6: Rule 2: should
	 *         contain atleast 1 Uppercase letter Uc7: Rule 3: should contain
	 *         atleast 1 number Uc8: Rule 4: should contain atleast 1 special
	 *         character
	 * @throws UserDefinedException
	 */

	public boolean validatePassword(String password) throws UserDefinedException {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		Matcher matcher = pattern.matcher(password);
		if (!matcher.matches()) {
			throw new UserDefinedException("Enter a valid pattern");
		}
		return matcher.matches();
	}
}