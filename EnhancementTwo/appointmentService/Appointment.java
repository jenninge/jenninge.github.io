package appointmentService;

/*
 * Function: Create accessors/mutators for AppointmentService class
 * Parameters: appointmentID = unique identifier, appointmentDate, appointmentDescription
 * Returns information for a new appointment
 */
public class Appointment {
	private String appointmentID = "";     
	private String appointmentDate = "";          
	private String appointmentDescription = "";
	
	@Override
	public String toString() {
		return "Appointment ID: " + this.appointmentID + "\n" + "Appointment Date: " + this.appointmentDate + "\n" + "Appointment Description: " + this.appointmentDescription;
	}
	
	public Appointment(String appointmentDate, String appointmentDescription) {
	
		if (appointmentDate == null || appointmentDate.length() > 10 || appointmentDate.length() < 10) {    
			throw new IllegalArgumentException("Invalid appointment date.");
		}
		else {
			this.appointmentDate = appointmentDate;     
		}

		if (appointmentDescription == null || appointmentDescription.length() > 50) {       
			throw new IllegalArgumentException("Invalid description.");
		}
		else {
			this.appointmentDescription = appointmentDescription;       
		}
	}
 

	
	public Appointment(String appointmentID, String appointmentDate, String appointmentDescription) {
		if (appointmentID == null || appointmentID.length() != 36) {         
			throw new IllegalArgumentException("Invalid ID.");
		}
		else {
			this.appointmentID = appointmentID;   
		}
		if (appointmentDate == null || appointmentDate.length() > 10 || appointmentDate.length() < 10) {    
			throw new IllegalArgumentException("Invalid appointment date.");
		}
		else {
			this.appointmentDate = appointmentDate;     
		}

		if (appointmentDescription == null || appointmentDescription.length() > 50) {       
			throw new IllegalArgumentException("Invalid description.");
		}
		else {
			this.appointmentDescription = appointmentDescription;       
		}
	}
	
	
	
	public String getAppointmentID() {     
		return this.appointmentID;
	}

	public String getAppointmentDate() {
		return this.appointmentDate;
	}
	
	public String getAppointmentDescription() {
		return this.appointmentDescription;
	}
	
	public void setAppointmentID(String appointmentID) {
		if (appointmentID == null || appointmentID.length() != 36) {
			throw new IllegalArgumentException("Invalid ID.");
		}
		else {
			this.appointmentID = appointmentID;
		}
	}
	
	public void setAppointmentDate(String appointmentDate) {
		if (appointmentDate == null || appointmentDate.length() > 10 || appointmentDate.length() < 10) {
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