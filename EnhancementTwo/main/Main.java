package main;

import java.util.Scanner;

import appointmentService.AppointmentService;
import contactService.ContactService;


public class Main {
	
	static void displayMainMenu() {
		System.out.println("Menu Option 1: Display contacts menu.");
		System.out.println("Menu Option 2: Display appointment menu.");
	}
	
	static void displayContactMenu() {
		System.out.println("Menu Option 1: Display all contacts.");
		System.out.println("Menu Option 2: Display a specific contact.");
		System.out.println("Menu Option 3: Add a new contact.");
		System.out.println("Menu Option 4: Delete a contact.");
		System.out.println("Menu Option 5: Update the first name of a contact.");
		System.out.println("Menu Option 6: Update the last name of a contact.");
		System.out.println("Menu Option 7: Update the phone number of a contact.");
		System.out.println("Menu Option 8: Update the address of a contact.");
	}
	
	static void displayAppointmentMenu() {
		System.out.println("Menu Option 1: Display all appointments.");
		System.out.println("Menu Option 2: Display a specific appointment.");
		System.out.println("Menu Option 3: Add a new appointment.");
		System.out.println("Menu Option 4: Update a specific appointment.");
		System.out.println("Menu Option 5: Delete a specific appointment.");
	}
	
	
	public static void appointmentSwitch() {
		
		String appointmentID = "";
		String appointmentDate = "";
		String appointmentDescription = "";
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); 
		int userInput = scanner.nextInt();
		
		AppointmentService appointment = new AppointmentService();
		
		
		switch(userInput) {
		case 1:
			appointment.displayAppointment();
			break;
		case 2: 
			appointment.displaySpecificAppointment(appointmentID, appointmentDate, appointmentDescription);
			break;
		case 3:
			appointment.addAppointment(appointmentID, appointmentDate, appointmentDescription);
			break;
		case 4:
			appointment.updateAppointment(appointmentID, appointmentDate, appointmentDescription);
			break;
		case 5:
			appointment.deleteAppointment(appointmentID, appointmentDate, appointmentDescription);
			break;
		default:
		}
	}
	
	public static void contactSwitch() {
		
		String contactID = "";     
		String firstName = "";
		String lastName = "";
		String phoneNumber = "";
		String address = "";
		
		ContactService contact = new ContactService();
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); 
		int userInput = scanner.nextInt();
		
		switch(userInput) {
		case 1:
			contact.displayContacts(contactID, firstName, lastName, phoneNumber, address);
			break;
		case 2: 
			contact.displaySpecificContact(contactID, firstName, lastName, phoneNumber, address);
			break;
		case 3:
			contact.addContact(contactID, firstName, lastName, phoneNumber, address);
			break;
		case 4:
			contact.deleteContact(contactID, firstName, lastName, phoneNumber, address);
			break;
		case 5:
			contact.updateFirstName(contactID, firstName);
			break;
		case 6:
			contact.updateLastName(contactID, lastName);
			break;
		case 7:
			contact.updatePhoneNumber(contactID, phoneNumber);
			break;
		case 8:
			contact.updateAddress(contactID, address);
			break;
			default:
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		displayMainMenu();
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); 
		int userInput = scanner.nextInt();

		while (true) {
			if (userInput == 1) {
				System.out.println("Please choose from the following menu options. \n");
				displayContactMenu();
	    		contactSwitch();
	    		
			} else if (userInput == 2) {
				System.out.println("Please choose from the following menu options. \n");
				displayAppointmentMenu();
	    		appointmentSwitch();
			} else {
				System.out.println("Invalid input. Please make a selection. \n");
			}
			
		}
			
	}

}
