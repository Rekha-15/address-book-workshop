package AddressBookWorkShop;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import AddressBookWorkshop.AddressBook;

public class AddressBookTest 
{
	/**
	 * This test case is use validate the first name Whether it is passed or not
	 */
	@Test
	public void firstNameTrueTest() 
	{
		AddressBook FirstName = new AddressBook();
		boolean result = FirstName.nameValidation("Rekha");
		assertEquals(true,result);
	}
	
	/**
	 * This test case is use validate the first name Whether it is passed or not
	 * its for false case
	 */
	
	@Test
	public void firstNameSadTest() 
	{
		boolean result = AddressBook.nameValidation("re");
		assertEquals(false,result);
	}
	/**
	 * This test case is use validate the last name Whether it is passed or not
	 */
	@Test
	public void lastNameTest() 
	{
		AddressBook LastName = new AddressBook();
		boolean result = LastName.nameValidation("Patil");
		assertEquals(true,result);
	}
	/**
	 * This test case is use validate the last name Whether it is passed or not
	 */
	@Test
	public void lastNameSadTest() 
	{
		AddressBook LastName = new AddressBook();
		boolean result = LastName.nameValidation("pa");
		assertEquals(false,result);
	}
	/**
	 * This test case is use validate the email Whether it is passed or not
	 */
	@Test
	public void emailTest() 
	{
		AddressBook email = new AddressBook();
		boolean result = email.email("abc@gmail.com");
		assertEquals(true,result);
	}
	/**
	 * This test case is use validate the email Whether it is passed or not
	 */
	@Test
	public void emailSadTest() 
	{
		AddressBook email = new AddressBook();
		boolean result = email.email("abc@gmail");
		assertEquals(true,result);
	}
	/**
	 * This test case is use validate the mobile number Whether it is passed or not
	 */
	@Test
	public void mobileNumValidation() 
	{
		AddressBook mobileNum = new AddressBook();
		boolean result = mobileNum.mobileNumValidation("91 9523546770");
		assertEquals(true,result);
	}
	/**
	 * This test case is use validate the mobile number Whether it is passed or not
	 */
	@Test
	public void mobileNumValidationSad() 
	{
		AddressBook mobileNum = new AddressBook();
		boolean result = mobileNum.mobileNumValidation("523546770");
		assertEquals(false,result);
	}
}