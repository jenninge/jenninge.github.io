package appointmentService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;


public class AppointmentService {

	static ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();    //declaring an array list for appointments, chose this over just an array due to the various manipulations it will undergo
	Iterator<Appointment> it = appointmentList.iterator();//declaring iterator to search arrayList
	
	
	public static void displayMenu() {
		System.out.print("Menu Option 1: Display all appointments.");
		System.out.print("Menu Option 2: Display a specific appointment.");
		System.out.print("Menu Option 3: Add a new appointment.");
		System.out.print("Menu Option 4: Update a specific appointment.");
		System.out.print("Menu Option 5: Delete a specific appointment.");
	}
	public void displayAppointment(String appointmentID, Date appointmentDate, String appointmentDescription) {
		for (int i = 0; i < appointmentList.size(); ++i) {                      //iterates through array list until end of list
			Appointment appointment = new Appointment(appointmentID, appointmentDate, appointmentDescription);        //creates a new appointment object
			System.out.println(appointment);        //prints the array list
			i++;           //increments through list
		}
	}
	
	public void addAppointment(String appointmentID, Date appointmentDate, String appointmentDescription) {      //create add appointment method
		
		Appointment appointment = new Appointment(appointmentID, appointmentDate, appointmentDescription);           //creates a new appointment object
		
		appointmentList.add(appointment);      //adds appointment to the arrayList
		
	}

	public void deleteAppointment(String appointmentID) {     //create delete appointment method
		
		while (it.hasNext()) {                        //will iterate through arrayList as long as there is a next object
			if (it.next().getAppointmentID().equals(appointmentID)) {         //checks to see if the object in the list matches the appointmentID
				it.remove();                          //if matches then removes appointment
			}
		}	
	
	}
	
	public static void main(String[] args) {
		displayMenu();
		
	}
}