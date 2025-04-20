package appointmentTests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Date;

import appointmentService.Appointment;

public class AppointmentTest {

	@Test
	@DisplayName("Testing Appointment")
	void testAppointment() {
		Date date = new Date();               //creates new date object
		Appointment appointment = new Appointment("542576", date, "Establish care");              //tests appointment
		assertTrue(appointment.getAppointmentID().equals("542576"));
		assertTrue(appointment.getAppointmentDate().equals(date));
		assertTrue(appointment.getAppointmentDescription().equals("Establish care"));
		
	}
	
	@Test
	@DisplayName("Testing appointmentID when greater than 10 characters")       //testing appointmentID when it is over 10 characters
	void testAppointmentIDTooLong() {
		Date date = new Date();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {    //throws exception when appointmentID is too long
			new Appointment("542576648575569", date, "Establish care");
		});     
	}
	
	@Test
	@DisplayName("Testing appointmentDate when date is in the past")  //testing appointmentDate when it is in the past
	void testAppointmentDateOld() {
		Date date = new Date();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {               //throws exception when appoint date is in the past
			new Appointment("542576", date, "Establish care");
		});     
	}
	
	@Test
	@DisplayName("Testing appointmentDescription when greater than 50 characters")    //testing appointment description when it is over 50 characters
	void testAppointmentDescriptionTooLong() {
		Date date = new Date();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {          //throws exception
			new Appointment("542576", date, "Establish care and go over every aspect that will take 4 hours to complete");
		});     
	}
	
	@Test
	@DisplayName("Testing appointmentID is not nothing")            //testing when appointmentID is null
	void testAppointmentIDNotNull() {
		Date date = new Date();
		Appointment appointment = new Appointment(null, date, "Establish care");
		assertNotNull(appointment.getAppointmentID(), "appointmentID was Null");         
	}
	
	@Test
	@DisplayName("Testing appointmentDate is not nothing")            //testing when appointment date is null
	void testAppointmentDateNotNull() {
		Appointment appointment = new Appointment("542576", null, "Establish care");
		assertNotNull(appointment.getAppointmentDate(), "appointmentDate was Null");
	}
	
	@Test
	@DisplayName("Testing appointmentDescription is not nothing")          //testing when appointment description is null
	void testAppointmentDescriptionNotNull() {
		Date date = new Date();
		Appointment appointment = new Appointment("542576", date, null);
		assertNotNull(appointment.getAppointmentDescription(), "appointmentDescription was Null");
	}	
}