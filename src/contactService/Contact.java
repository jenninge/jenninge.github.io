package contactService;

/*
 * Function: Create accessors/mutators for ContactService class
 * Parameters: contactID = unique identifier, firstName, lastName, phoneNumber, address
 * Returns information for a new/existing contact
 */
public class Contact {  //creating class, Contact
	
	private String contactID = "";     
	private String firstName = "";
	private String lastName = "";
	private String phoneNumber = "";
	private String address = "";
	
	@Override
	public String toString() {
		return "Contact ID: " + this.contactID + "\n" + "First Name: " + this.firstName + "\n" + "Last Name: " + this.lastName + "\n" + "Phone Number: " + this.phoneNumber + "\n" + "Address: " + this.address;
	}
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		if (contactID == null || contactID.length() != 36) {        
			throw new IllegalArgumentException("Invalid ID.");
		}
		else {
			this.contactID = contactID;   
		}
		if (firstName == null || firstName.length() > 10) {    
			throw new IllegalArgumentException("Invalid first name.");
		}
		else {
			this.firstName = firstName;    
		}
		if (lastName == null || lastName.length() > 10) {           
			throw new IllegalArgumentException("Invalid last name.");
		}
		else {
			this.lastName = lastName;          
		}
		if (phoneNumber == null || phoneNumber.length() != 12) {        
			throw new IllegalArgumentException("Invalid phone number.");
		}
		else {
			this.phoneNumber = phoneNumber;        
		}
		if (address == null || address.length() > 30) {            
			throw new IllegalArgumentException("Invalid address.");
		}
		else {
			this.address = address;      
		}
	}
	
	public String getContactID() {     
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
		if (contactID == null || contactID.length() != 36) {
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