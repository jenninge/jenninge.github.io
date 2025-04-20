package contactService;

import java.util.ArrayList;
import java.util.Iterator; 

public class ContactService  {

	
	static ArrayList<Contact> contactList = new ArrayList<Contact>();    //declaring an array list for contacts, chose this over just an array due to the various manipulations it will undergo
	Iterator<Contact> it = contactList.iterator();                     //declaring iterator to search arrayList
	
	public void displayContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		for (int i = 0; i < contactList.size(); ++i) {                      //iterates through array list until end of list
			Contact contact = new Contact("545454", "John", "Smith", "4555554545", "100 Park Central Drive");        //creates a new contact object
			System.out.println(contact);        //prints the array list
			i++;           //increments through list
		}
	}
	
	public void addContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {      //create add contact method
		
		Contact contact = new Contact(contactID, firstName, lastName, phoneNumber, address);           //creates a new contact object
		
		contactList.add(contact);      //adds contact to the arrayList
		
	}

	public void deleteContact(String contactID) {     //create delete contact method
		
		while (it.hasNext()) {                        //will iterate through arrayList as long as there is a next object
			if (it.next().getContactID().equals(contactID)) {         //checks to see if the object in the list matches the contactID
				it.remove();                          //if matches then removes contact
			}
		}	
	}
	
	public void updateFirstName(String contactID, String firstName) {     //create update first name method
		
		for (Contact contact : contactList) {     //for each loop to loop through array list
			if (contact.getContactID().equals(contactID) ) {      //checks if a contactID equals the contactID being searched
				contact.setFirstName(firstName);                 //updates first name
			}
		}
	}
	
	public void updateLastName(String contactID, String lastName) {         //create update last name method
		for (Contact contact : contactList) {     //for each loop to loop through array list
			if (contact.getContactID().equals(contactID) ) {      //checks if a contactID equals the contactID being searched
				contact.setFirstName(lastName);               //updates last name
			}
		}
	}
	
	public void updatePhoneNumber(String contactID, String phoneNumber) {     //create update phone number method
		for (Contact contact : contactList) {     //for each loop to loop through array list
			if (contact.getContactID().equals(contactID) ) {      //checks if a contactID equals the contactID being searched
				contact.setFirstName(phoneNumber);               //updates phone number
			}
		}
	}
	 
	public void updateAddress(String contactID, String address) {              //create update address method
		for (Contact contact : contactList) {     //for each loop to loop through array list
			if (contact.getContactID().equals(contactID) ) {      //checks if a contactID equals the contactID being searched
				contact.setFirstName(address);               //updates address
			}
		}
	}
}