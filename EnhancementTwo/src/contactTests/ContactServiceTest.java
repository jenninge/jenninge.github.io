package contactTests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import contactService.ContactService;

class ContactServiceTest {

	@Test
	@DisplayName("Testing addContact function")     //test addContact function
	void testAddContact() {
		ContactService contactS = new ContactService(); 
		contactS.addContact("545454", "JohnMayerTwo", "Smith", "4555554545", "100 Park Central Drive");
		assertTrue(contactS.equals(contactS), "Contact was not added");     //asserts that contact was added
	}
	
	@Test
	@DisplayName("Testing delete contacts")            //tests deleteContact function
	void testDeletContact() {
		ContactService contactS = new ContactService(); 
		contactS.addContact("545454", "JohnMayerTwo", "Smith", "4555554545", "100 Park Central Drive");
		contactS.deleteContact("545454");
		assertTrue(contactS.equals(contactS), "Contact was not deleted");          //asserts that the contact was deleted
	}
	
	@Test
	@DisplayName("Testing updating first name")                         //tests update first name function
	void testUpdateFirstName() {
		ContactService contactS = new ContactService(); 
		contactS.addContact("545454", "JohnMayerTwo", "Smith", "4555554545", "100 Park Central Drive");
		contactS.updateFirstName("545454", "Joe");
		assertTrue(contactS.equals(contactS), "Contact's first name was not updated");      //asserts the first name was updated
	}
	
	@Test
	@DisplayName("Testing updating last name")                                              //tests update last name function
	void testUpdateLastName() {
		ContactService contactS = new ContactService(); 
		contactS.addContact("545454", "JohnMayerTwo", "Smith", "4555554545", "100 Park Central Drive");
		contactS.updateLastName("545454", "Walton");
		assertTrue(contactS.equals(contactS), "Contact's last name was not updated");         //asserts the last name was updated
	}
	
	@Test
	@DisplayName("Testing updating phone number")                          //tests the update phone number function
	void testPhoneNumber() {
		ContactService contactS = new ContactService(); 
		contactS.addContact("545454", "JohnMayerTwo", "Smith", "4555554545", "100 Park Central Drive");
		contactS.updatePhoneNumber("545454", "1112223333");
		assertTrue(contactS.equals(contactS), "Contact's phone number was not updated");          //asserts the phone number was updated
	}
	
	@Test
	@DisplayName("Testing updating address")            //tests the update address function
	void testAddress() { 
		ContactService contactS = new ContactService(); 
		contactS.addContact("545454", "JohnMayerTwo", "Smith", "4555554545", "100 Park Central Drive");
		contactS.updateAddress("545454", "1800 West St");
		assertTrue(contactS.equals(contactS), "Contact's address was not updated");               //asserts the address was updated
	}
	
	

}