/***********************************************************************************************
 *@purpose Implementing User Registration Program .
 *@author Rekha
 *@version 1.0
 *@since 18-06-2021
 ************************************************************************************************/
package com.UserRegistration;

import org.junit.Assert;
import org.junit.Test;
import com.UserRegistration.UserRegistration;

public class UserRegistrationTest {
	// FirstName
	/**
	 * @method testValidateFirstName test True case for first name
	 * @Test take a correct input where first latter is Cap
	 * @return true
	 */

	@Test
	public void testValidateFirstName() throws UserDefinedException {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateFirstName("Rekha");
		Assert.assertEquals(true, result);
	}

	/**
	 * @method testInvalidFirstName test false case for first name
	 * @Test take a wrong input where first latter is not Cap and adding number
	 * @return false
	 */

	@Test(expected = UserDefinedException.class)
	public void testInvalidFirstName() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validateFirstName("abc1");
	}

	/**
	 * @method testShortFirstName test false case for first name
	 * @Test take a wrong input where first latter is not Cap and we take only two
	 *       Character
	 * @return false
	 */

	@Test(expected = UserDefinedException.class)
	public void testShortFirstName() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validateFirstName("ab");
	}

	// LastName
	/**
	 * @method testValidateLastName test true case for last name
	 * @Test take a correct input where first latter is Cap
	 * @return true
	 */

	@Test
	public void testValidateLastName() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		boolean result = UserRegistration.validateLastName("Patil");
		Assert.assertEquals(true, result);
	}

	/**
	 * @method testInvalidLastName test false case for last name
	 * @Test take a wrong input where first latter is not Cap
	 * @return false
	 * @throws UserDefinedException
	 */

	@Test(expected = UserDefinedException.class)
	public void testInvalidLastName() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validateLastName("rEk");
	}

	/**
	 * @method testShortLastName test false case for last name
	 * @Test take a wrong input where first latter is not Cap and we take only two
	 *       Character
	 * @return false
	 */

	@Test(expected = UserDefinedException.class)
	public void testShortLastName() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validateLastName("re");
	}

	// Phone Number
	/**
	 * @method testValidPhoneNumber test true case for phoneNo
	 * @Test take right input where we mention country code then a space and then 10
	 *       digit phoneNo
	 * @return true
	 */

	@Test
	public void testValidPhoneNumber() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		boolean result = UserRegistration.validatePhoneNumber("91 7020714423");
		Assert.assertEquals(true, result);
	}

	/**
	 * @method testInvalidNoSpacePhoneNumber test false case for phoneNo
	 * @Test take wrong input where we mention country code but donot give a space
	 *       between country code and 10 digit phoneNo
	 * @return false
	 */

	@Test(expected = UserDefinedException.class)
	public void testInvalidNoSpacePhoneNumber() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePhoneNumber("918605141014");
	}

	/**
	 * @method testInvalidShortPhoneNumber test false case for phoneNo
	 * @Test take wrong input where we mention country code then a space and then
	 *       less then 10 digit phoneNo
	 * @return false
	 */

	@Test(expected = UserDefinedException.class)
	public void testInvalidShortPhoneNumber() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePhoneNumber("89 905141014");
	}

	/**
	 * @method testInvalidShortPhoneNumber test false case for phoneNo
	 * @Test take wrong input where we mention 10 digit phoneNo without country code
	 * @return false
	 */

	@Test(expected = UserDefinedException.class)
	public void testInvalidWithoutCountryCodePhoneNumber() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePhoneNumber("7020714423");
	}

//Password
	/**
	 * @method testvalidPassword test false case for password
	 * @test (follow all the 4 rules) Rule-1 Minimum 8 character Rule-2 At least one
	 *       Upper case Rule-3 At least one Numeric value Rule-4 at least one
	 *       Special character
	 * @return true
	 */

	@Test
	public void testValidPassword() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		boolean result = UserRegistration.validatePassword("Rekha15@");
		Assert.assertEquals(true, result);
	}

	/**
	 * @method testvalidPassword test false case for phoneNo
	 * @test skip Rule1 Rule-1 Minimum 8 character Rule-2 At least one Upper case
	 *       Rule-3 At least one Numeric value Rule-4 at least one Special character
	 * @return false
	 */

	@Test(expected = UserDefinedException.class)
	public void testInvalidShortPassword() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePassword("Rek15@");
	}

	/**
	 * @method testvalidPassword test false case for phoneNo
	 * @test skip Rule2 Rule-1 Minimum 8 character Rule-2 At least one Upper case
	 *       Rule-3 At least one Numeric value Rule-4 at least one Special character
	 * @return false
	 */

	@Test(expected = UserDefinedException.class)
	public void testInvalidSkipUpperCasePassword() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePassword("24rekhs@");
	}

	/**
	 * @method testvalidPassword test false case for phoneNo
	 * @test skip Rule3 Rule-1 Minimum 8 character Rule-2 At least one Upper case
	 *       Rule-3 At least one Numeric value Rule-4 at least one Special character
	 * @return false
	 */

	@Test(expected = UserDefinedException.class)
	public void testInvalidSkipNumericValuePassword() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePassword("Rekha@");
	}

	/**
	 * @method testvalidPassword test false case for phoneNo
	 * @test skip Rule4 Rule-1 Minimum 8 character Rule-2 At least one Upper case
	 *       Rule-3 At least one Numeric value Rule-4 at least one Special character
	 * @return false
	 */

	@Test(expected = UserDefinedException.class)
	public void testInvalidSkipSpecialCharacterPassword() throws UserDefinedException {
		UserRegistration UserRegistration = new UserRegistration();
		UserRegistration.validatePassword("Rekha15");
	}
}