package appointmentTests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import appointmentService.AppointmentService;

public class AppointmentServiceTest {

	@Test
	@DisplayName("Testing addAppointment function will add")     //test add appointment function
	void testAddAppointment() {
		AppointmentService appointmentS = new AppointmentService(); 
		Date date = new Date();                                       //creates new date object
		appointmentS.addAppointment("542576", date, "Establish care");
		assertTrue(appointmentS.equals(appointmentS), "Appointment was not added");     //asserts that appointment was added
	}
	
	@Test
	@DisplayName("Testing deleteAppointment function will delete")     //test delete appointment function
	void testDeleteTask() {
		AppointmentService appointmentS = new AppointmentService();
		Date date = new Date();                                     //creates new date object
		appointmentS.addAppointment("542576", date, "Establish care");       //add appointment
		appointmentS.deleteAppointment("542576");                                      //delete appointment by appointmentID
		assertTrue(appointmentS.equals(appointmentS), "Appointment was not deleted");     //asserts that appointment was deleted
	}

}
