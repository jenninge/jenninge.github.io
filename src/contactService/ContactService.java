package contactService;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

/*
 * Function: Class for CRUD operations for the Contact Hash Map
 * Hash Map: Best Time Complexity: O(1)
 * Hash Map: Worst Time Complexity: O(n)
 */
public class ContactService  {
	
	Scanner scanner = new Scanner(System.in);
	
	public static HashMap<String, Contact > contactList = new HashMap<String, Contact>();    
	Iterator<Map.Entry<String, Contact>> it = contactList.entrySet().iterator();   
	
	
	public void displayContacts(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		while(it.hasNext()) {
			Map.Entry<String, Contact> contactEntry = it.next();
			Contact contact = contactEntry.getValue();
			System.out.println(contact);
			
		}
	}
	
	public void displaySpecificContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		
		displayContacts(contactID, firstName, lastName, phoneNumber, address);
		
		System.out.println("Please enter the contactID to retrieve contact information.");
		contactID = scanner.nextLine();
		
		if (contactList.containsKey(contactID)) {
			Contact contact = contactList.get(contactID);
			System.out.println(contact);
		} else {
			System.out.println(contactID + " could not be found.");
		}
	
	}
	
	public void addContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {    
		String uniqueID = UUID.randomUUID().toString();
		contactID = uniqueID;
		System.out.println("Please enter the required information for a new contact.");
		System.out.println("Appointment ID: " + contactID);
		System.out.println("Please enter the first name. ");
		firstName = scanner.nextLine();
		System.out.println("Please enter the last name. ");
		lastName = scanner.nextLine();
		System.out.println("Please enter the phone number. ");
		phoneNumber = scanner.nextLine();
		System.out.println("Please enter the address. ");
		address = scanner.nextLine();
		
		Contact contact = new Contact(contactID, firstName, lastName, phoneNumber, address); 
		contactList.put(contactID, contact);
		
	}

	public void deleteContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {   
		
		System.out.println("Please enter the phone number you wish to delete. ");
		phoneNumber = scanner.nextLine();
		
		while (it.hasNext()) {
			if (it.next().getKey().equals(phoneNumber)) {
				it.remove();
			}
		}
		
		System.out.println(phoneNumber + " has been deleted. ");	
		displayContacts(contactID, firstName, lastName, phoneNumber, address);
	}
	
	public void updateFirstName(String contactID, String firstName) {     
		
		System.out.println("Please enter the contactID to retrieve contact information for updating.");
		contactID = scanner.nextLine();
		System.out.println("Please enter the new first name to be updated.");
		String newFirstName = scanner.nextLine();
		
		if (contactList.containsKey(contactID)) {
			Contact contact = contactList.get(contactID);
			contact.setFirstName(newFirstName);
			System.out.println(contactID + " has been updated.");
			System.out.println(contact);
		} else {
			System.out.println(contactID + " could not be found.");
		}
	}
	
	public void updateLastName(String contactID, String lastName) {         
		System.out.println("Please enter the contactID to retrieve contact information for updating.");
		contactID = scanner.nextLine();
		System.out.println("Please enter the new last name to be updated.");
		String newLastName = scanner.nextLine();
		
		if (contactList.containsKey(contactID)) {
			Contact contact = contactList.get(contactID);
			contact.setLastName(newLastName);
			System.out.println(contactID + " has been updated.");
			System.out.println(contact);
		} else {
			System.out.println(contactID + " could not be found.");
		}
	}
	
	public void updatePhoneNumber(String contactID, String phoneNumber) {     
		System.out.println("Please enter the contactID to retrieve contact information for updating.");
		contactID = scanner.nextLine();
		System.out.println("Please enter the new phone number to be updated.");
		String newPhoneNumber = scanner.nextLine();
		
		if (contactList.containsKey(contactID)) {
			Contact contact = contactList.get(contactID);
			contact.setPhoneNumber(newPhoneNumber);
			System.out.println(contactID + " has been updated.");
			System.out.println(contact);
		} else {
			System.out.println(contactID + " could not be found.");
		}
	}
	 
	public void updateAddress(String contactID, String address) {             
		System.out.println("Please enter the contactID to retrieve contact information for updating.");
		contactID = scanner.nextLine();
		System.out.println("Please enter the new first name to be updated.");
		String newAddress = scanner.nextLine();
		
		if (contactList.containsKey(contactID)) {
			Contact contact = contactList.get(contactID);
			contact.setAddress(newAddress);
			System.out.println(contactID + " has been updated.");
			System.out.println(contact);
		} else {
			System.out.println(contactID + " could not be found.");
		}
	}
}