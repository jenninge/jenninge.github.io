package contactTests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import contactService.Contact;

class ContactTest {

	@Test
	@DisplayName("Testing Contact")
	void testContact() {
		Contact contact = new Contact("542576", "John", "Smith", "4555554545", "100 Park Central Drive");              //tests contact
		assertTrue(contact.getContactID().equals("542576"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Smith"));
		assertTrue(contact.getPhoneNumber().equals("4555554545"));
		assertTrue(contact.getAddress().equals("100 Park Central Drive"));
	}
	
	@Test
	@DisplayName("Testing contactID when greater than 10 characters")
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("54257675466756", "John", "Smith", "4555554545", "100 Park Central Drive");
		});     
	}
	
	@Test
	@DisplayName("Testing firstName when greater than 10 characters")
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("542576", "JohnMayerTwo", "Smith", "4555554545", "100 Park Central Drive");
		});     
	}
	
	@Test
	@DisplayName("Testing lastName when greater than 10 characters")
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("542576", "John", "SmithHeimers", "4555554545", "100 Park Central Drive");
		});     
	}
	
	@Test
	@DisplayName("Testing phoneNumber when greater than 10 characters")
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("542576", "John", "Smith", "45555545454587", "100 Park Central Drive");
		});     
	}
	
	@Test
	@DisplayName("Testing address when greater than 10 characters")
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("542576", "John", "Smith", "4555554545", "100 Park Central Drive, Apt 35, Minnesota, 0000");
		});     
	}
	
	@Test
	@DisplayName("Testing contactID not nothing")
	void testContactIDNotNull() {
		Contact contact = new Contact(null, "John", "Smith", "4555554545", "100 Park Central Drive");
		assertNotNull(contact.getContactID(), "contactID was Null");
	}
	
	@Test
	@DisplayName("Testing firstName not nothing")
	void testFirstNameNotNull() {
		Contact contact = new Contact("542576", null, "Smith", "4555554545", "100 Park Central Drive");
		assertNotNull(contact.getFirstName(), "firstName was Null");
	}
	
	@Test
	@DisplayName("Testing lastName not nothing")
	void testLastNameNotNull() {
		Contact contact = new Contact("542576", "John", null, "4555554545", "100 Park Central Drive");
		assertNotNull(contact.getLastName(), "lastName was Null");
	}
	
	@Test
	@DisplayName("Testing phoneNumber not nothing")
	void testPhoneNumberNotNull() {
		Contact contact = new Contact("542576", "John", "Smith", null, "100 Park Central Drive");
		assertNotNull(contact.getPhoneNumber(), "phoneNumber was Null");
	}
	
	@Test
	@DisplayName("Testing phoneNumber not nothing")
	void testAddressNotNull() {
		Contact contact = new Contact("542576", "John", "Smith", "4555554545", null);
		assertNotNull(contact.getAddress(), "Address was Null");
	}	
}