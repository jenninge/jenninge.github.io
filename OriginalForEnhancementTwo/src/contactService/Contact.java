package contactService;

public class Contact {  //creating class, Contact
	
	private String contactID = "";     //initializing and declaring variables for contact information
	private String firstName = "";
	private String lastName = "";
	private String phoneNumber = "";
	private String address = "";
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		if (contactID == null || contactID.length() > 10) {         //checking if contactID is null or over 10 characters long
			throw new IllegalArgumentException("Invalid ID.");
		}
		else {
			this.contactID = contactID;   //if not null/longer than 10 characters set as contactID
		}
		if (firstName == null || firstName.length() > 10) {    //checking if firstname is null or over 10 characters long
			throw new IllegalArgumentException("Invalid first name.");
		}
		else {
			this.firstName = firstName;     //if not null/longer than 10 characters set as firstName
		}
		if (lastName == null || lastName.length() > 10) {           //checking if lastname is null or over 10 characters long
			throw new IllegalArgumentException("Invalid last name.");
		}
		else {
			this.lastName = lastName;          //if not null/longer than 10 characters set as lastName
		}
		if (phoneNumber == null || phoneNumber.length() != 10) {        //checking if phoneNumber is null or not 10 characters long
			throw new IllegalArgumentException("Invalid phone number.");
		}
		else {
			this.phoneNumber = phoneNumber;         //if not null/longer than 10 characters set as phoneNumber
		}
		if (address == null || address.length() > 30) {             //checking if address is null or over 30 characters long
			throw new IllegalArgumentException("Invalid address.");
		}
		else {
			this.address = address;       //if not null/longer than 10 characters set as address
		}
	}
	
	public String getContactID() {     //creating accessors/mutators to get/set contact information
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setContactID(String contactID) {
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID.");
		}
		else {
			this.contactID = contactID;
		}
	}
	
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name.");
		}
		else {
			this.firstName = firstName;
		}
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name.");
		}
		else {
			this.lastName = lastName;
		}
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number.");
		}
		else {
			this.phoneNumber = phoneNumber;
		}
	}
	
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address.");
		}
		else {
			this.address = address;
		}
	}
	

}
