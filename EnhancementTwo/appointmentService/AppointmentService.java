package appointmentService;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.UUID;



/*
 * Function: Class for CRUD operations for the Appointment Linked List
 * Linked List: Best Time Complexity: O(1)
 * Linked List: Worst Time Complexity: O(n)
 */
public class AppointmentService {

	Scanner scanner = new Scanner(System.in);

	public static LinkedList<Appointment> appointmentList = new LinkedList<Appointment>();
	ListIterator<Appointment> it = appointmentList.listIterator();

	public void displayAppointment() {
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
	 
	public void displaySpecificAppointment(String appointmentID, String appointmentDate,
			String appointmentDescription) {
		System.out.println("Please enter the appointment date you wish to look-up. ");
		appointmentDate = scanner.nextLine();
		
		while (it.hasNext()) {
			Appointment appointmentData = it.next();
			if (appointmentData.getAppointmentDate().equals(appointmentDate)) {
				System.out.println(appointmentData);
			}
		}
		
	}

	// Time complexity for inserting at end of a linked list: O(n)
	public void addAppointment(String appointmentID, String appointmentDate, String appointmentDescription) {
		String uniqueID = UUID.randomUUID().toString();
		appointmentID = uniqueID;
		
		System.out.println("Please enter the required information for a new appointment.");
		System.out.println("Appointment ID: " + appointmentID);
		System.out.println("Please enter appointment date in format of YYYY/MM/DD. ");
		appointmentDate = scanner.nextLine();
		System.out.println("Please enter appointment description. ");
		appointmentDescription = scanner.nextLine();
		
		Appointment appointment = new Appointment(appointmentID, appointmentDate, appointmentDescription);
		appointmentList.add(appointment);

		System.out.println("New appointment has been added.");
		System.out.println("Here are the details: " + appointmentID + "\n" + appointmentDate + "\n" + appointmentDescription);

	}

	// Time complexity for searching a linked list: O(n)
	public void updateAppointment(String appointmentID, String appointmentDate, String appointmentDescription) {
		System.out.println("Please enter the appointment description you wish to update. ");
		appointmentDescription = scanner.nextLine();
		while (it.hasNext()) {
			if (it.next().getAppointmentDescription().equals(appointmentDescription)) {
					System.out.println("Please enter updated appointment date and description.");
					appointmentDate = scanner.nextLine();
					appointmentDescription = scanner.nextLine();
					it.set(new Appointment(appointmentDate, appointmentDescription));
					System.out.println(appointmentID + " has been updated with the following information: " + appointmentDate
							+ " " + appointmentDescription + "\n");
			} else {
				System.out.println("That appointment does not exist. ");		
			}
		}
		displayAppointment();
	}

	// Time complexity for deleting at specific position in a linked list: O(n)
	//Errors: Unable to remove element
	public void deleteAppointment(String appointmentID, String appointmentDate, String appointmentDescription) {

		displaySpecificAppointment(appointmentID, appointmentDate, appointmentDescription);
		
		System.out.println("Please enter the appointment ID you wish to delete. ");
		appointmentID = scanner.nextLine();
		
		while (it.hasNext()) { 
			Appointment appointmentData = it.next();
			if (appointmentData.getAppointmentID().equals(appointmentID)) {
				it.remove();    //NOT WORKING PROPERLY. DOES NOT REMOVE ELEMENT
			}
		}
		System.out.println(appointmentDate + " " + appointmentDescription + " has been deleted. ");
		
	}
}