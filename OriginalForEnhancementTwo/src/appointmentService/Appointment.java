package appointmentService;
import java.util.Date;

public class Appointment {
	private String appointmentID = "";     //initializing and declaring variables for task information
	private Date appointmentDate;          //Date is its own data type
	private String appointmentDescription = "";

	
	public Appointment(String appointmentID, Date appointmentDate, String appointmentDescription) {
		if (appointmentID == null || appointmentID.length() > 10) {         //checking if appointmentID is null or over 10 characters long
			throw new IllegalArgumentException("Invalid ID.");
		}
		else {
			this.appointmentID = appointmentID;   //if not null/longer than 10 characters set as appointmentID
		}
		if (appointmentDate == null || appointmentDate.before(new Date())) {    //checking if appointment date is null or in the past
			throw new IllegalArgumentException("Invalid appointment date.");
		}
		else {
			this.appointmentDate = appointmentDate;     //if not null/date in the past set appointment Date
		}

		if (appointmentDescription == null || appointmentDescription.length() > 50) {       //checking if description is null or over 50 characters long
			throw new IllegalArgumentException("Invalid description.");
		}
		else {
			this.appointmentDescription = appointmentDescription;       //if not null/longer than 50 characters set as appointment description
		}
	}
	
	public String getAppointmentID() {     //creating accessors/mutators to get/set appointment information
		return appointmentID;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	public String getAppointmentDescription() {
		return appointmentDescription;
	}
	
	public void setAppointmentID(String appointmentID) {
		if (appointmentID == null || appointmentID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID.");
		}
		else {
			this.appointmentID = appointmentID;
		}
	}
	
	public void setAppointmentDate(Date appointmentDate) {
		if (appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Invalid appointment date.");
		}
		else {
			this.appointmentDate = appointmentDate;
		}
	}
	
	public void setAppointmentDescription(String appointmentDescription) {
		if (appointmentDescription == null || appointmentDescription.length() > 50) {
			throw new IllegalArgumentException("Invalid description.");
		}
		else {
			this.appointmentDescription = appointmentDescription;
		}
	}
}