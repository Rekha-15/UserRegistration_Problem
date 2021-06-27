/*******************************************************************
 *@purpose Implementing User Registration Program .
 *@author Rekha
 *@version 1.0
 *@since 18-06-2021
 *********************************************************************/
package com.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 * UserRegistrationTest is a public class
 * Using to validate for different inputs
 */

public class UserRegistrationTest {
	
	UserRegistration user;
	boolean result;
	String[] allEmails;

	@Before
	public void setup() {

		user = new UserRegistration();

	}

	// FirstName
		/**
		 * @method testValidateFirstName test True case for first name
		 * @Test take a correct input where first latter is Cap
		 * @return true
		 */

		@Test
		public void testValidateFirstName() {
			boolean result = user.checkFirstName.validate("Rekha");
			Assert.assertEquals(true, result);
		}

		/**
		 * @method testInvalidFirstName test false case for first name
		 * @Test take a wrong input where first latter is not Cap and adding number
		 * @return false
		 */

		@Test
		public void testInvalidFirstName() {
			boolean result = user.checkFirstName.validate("abc1");
			Assert.assertEquals(false, result);
		}

		/**
		 * @method testShortFirstName test false case for first name
		 * @Test take a wrong input where first latter is not Cap and we take only two
		 *       Character
		 * @return false
		 */

		@Test
		public void testShortFirstName() {
			boolean result = user.checkFirstName.validate("ab");
			Assert.assertEquals(false, result);
		}

		// LastName
		/**
		 * @method testValidateLastName test true case for last name
		 * @Test take a correct input where first latter is Cap
		 * @return true
		 */

		@Test
		public void testValidateLastName() {
			boolean result = user.checkLastName.validate("Patil");
			Assert.assertEquals(true, result);
		}

		/**
		 * @method testInvalidLastName test false case for last name
		 * @Test take a wrong input where first latter is not Cap
		 * @return false
		 */

		@Test
		public void testInvalidLastName() {
			boolean result = user.checkLastName.validate("rEK");
			Assert.assertEquals(false, result);
		}

		/**
		 * @method testShortLastName test false case for last name
		 * @Test take a wrong input where first latter is not Cap and we take only two
		 *       Character
		 * @return false
		 */

		@Test
		public void testShortLastName() {
			boolean result = user.checkLastName.validate("re");
			Assert.assertEquals(false, result);
		}
		
		//email id
		
		/**
		 * @method testvalidateEmail test true case for email id
		 * @Test take a correct input 
		 * @return true
		 */
		@Test
		public void testvalidateEmail() {
			boolean result = user.checkEmail.validate("rekhapatil.1509@gmail.com");
			Assert.assertEquals(true, result);
		}
		
		/**
		 * @method testanothervalidateEmail test true case for email id
		 * @Test take a correct input 
		 * @return true
		 */
		
		@Test
		public void testanothervalidateEmail() {
			UserRegistration userValidator = new UserRegistration();
			boolean result = user.checkEmail.validate("rekha15patil@gmail.com");
			Assert.assertEquals(true, result);
		}

		/**
		 * @method testInvalidEmail test false case for email id
		 * @Test taking a wrong input where there is no .com
		 * @return false
		 */
		
		@Test
		public void testInvalidEmail() {
			boolean result = user.checkEmail.validate("rekhapatil.1509@gmail.");
			Assert.assertEquals(false, result);
		}
		
		/**
		 * @method testInvalidEmail test false case for email id
		 * @Test taking a wrong input where there is no gmail  @gmail.com 
		 * @return false
		 */
		
		@Test
		public void testNoextensionInvalidEmail() {
			boolean result = user.checkEmail.validate("rekhapatil.1509");
			Assert.assertEquals(false, result);
		}
		
		/**
		 * @method testNospecialCharInvalidEmail test false case for email id
		 * @Test taking a wrong input where there is no special char i.e @
		 * @return false
		 */
		
		@Test
		public void testNospecialCharInvalidEmail() {
			boolean result = user.checkEmail.validate("rekhapatil.1509gmail.com");
			Assert.assertEquals(false, result);
		}
			

		// Phone Number
		/**
		 * @method testValidPhoneNumber test true case for phoneNo
		 * @Test take right input where we mention country code then a space and then 10
		 *       digit phoneNo
		 * @return true
		 */

		@Test
		public void testValidPhoneNumber() {
			boolean result = user.checkMobileNum.validate("91 8095592954");
			Assert.assertEquals(true, result);
		}

		/**
		 * @method testInvalidNoSpacePhoneNumber test false case for phoneNo
		 * @Test take wrong input where we mention country code but donot give a space
		 *       between country code and 10 digit phoneNo
		 * @return false
		 */

		@Test
		public void testInvalidNoSpacePhoneNumber() {
			boolean result = user.checkMobileNum.validate("919090909090");
			Assert.assertEquals(false, result);
		}

		/**
		 * @method testInvalidShortPhoneNumber test sad case for phoneNo
		 * @Test take wrong input where we mention country code then a space and then
		 *       less then 10 digit phoneNo
		 * @return false
		 */

		@Test
		public void testInvalidShortPhoneNumber() {
			boolean result = user.checkMobileNum.validate("89 89898989");
			Assert.assertEquals(false, result);
		}

		/**
		 * @method testInvalidShortPhoneNumber test sad case for phoneNo
		 * @Test take wrong input where we mention 10 digit phoneNo without country code
		 * @return false
		 */

		@Test
		public void testInvalidWithoutCountryCodePhoneNumber() {
			boolean result = user.checkMobileNum.validate("87100973678");
			Assert.assertEquals(false, result);
		}
		
	// Password
		/**
		 * @method testvalidPassword test true case for phoneNo
		 * @test (follow all the 4 rules) Rule-1 Minimum 8 character Rule-2 At least one
		 *       Upper case Rule-3 At least one Numeric value Rule-4 at least one
		 *       Special character
		 * @return true
		 */

		@Test
		public void testValidPassword() {
			boolean result = user.checkPassword.validate("Rekha15@");
			Assert.assertEquals(true, result);
		}

		/**
		 * @method testvalidPassword test false case for phoneNo
		 * @test skip Rule1 Rule-1 Minimum 8 character Rule-2 At least one Upper case
		 *       Rule-3 At least one Numeric value Rule-4 at least one Special character
		 * @return false
		 */

		@Test
		public void testInvalidShortPassword() {
			boolean result = user.checkPassword.validate("rek15@");
			Assert.assertEquals(false, result);
		}

		/**
		 * @method testvalidPassword test false case for phoneNo
		 * @test skip Rule2 Rule-1 Minimum 8 character Rule-2 At least one Upper case
		 *       Rule-3 At least one Numeric value Rule-4 at least one Special character
		 * @return false
		 */

		@Test
		public void testInvalidSkipUpperCasePassword() {
			boolean result = user.checkPassword.validate("15rekha@");
			Assert.assertEquals(false, result);
		}

		/**
		 * @method testvalidPassword test false case for phoneNo
		 * @test skip Rule3 Rule-1 Minimum 8 character Rule-2 At least one Upper case
		 *       Rule-3 At least one Numeric value Rule-4 at least one Special character
		 * @return false
		 */

		@Test
		public void testInvalidSkipNumericValuePassword() {
			boolean result = user.checkPassword.validate("rekha@");
			Assert.assertEquals(false, result);
		}

		/**
		 * @method testvalidPassword test sad case for phoneNo
		 * @test skip Rule4 Rule-1 Minimum 8 character Rule-2 At least one Upper case
		 *       Rule-3 At least one Numeric value Rule-4 at least one Special character
		 * @return false
		 */

		@Test
		public void testInvalidSkipSpecialCharacterPassword() {
			boolean result = user.checkPassword.validate("Rekhapatil5");
			Assert.assertEquals(false, result);
		}
		
	/**
	 * Checking for email validation 
	 * and printing mentioned email is correct(true) or wrong(false)
	 */
		
	@Test
	public void All_Email_valid_True() {

		allEmails = new String[] { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };

		for (String emailIDs : allEmails) {

			result = user.checkEmail.validate(emailIDs);
			System.out.println(result);
			Assert.assertEquals(true, result);

		}
		
	}

	@Test
	public void All_Email_validation_false() {

		allEmails = new String[] { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
				".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
				"abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

		for (String emailIDs : allEmails) {
			result = user.checkEmail.validate(emailIDs);
			System.out.println(result);
			Assert.assertFalse(result);

		}
	}
}