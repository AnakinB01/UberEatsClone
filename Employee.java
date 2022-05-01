public class Employee extends User {

	private int staffID;
	
	public Employee(String firstname, String lastname, String email, int phoneNo, String dateOfBirth, int staffID) {
		super(firstname, lastname, email, phoneNo, dateOfBirth);
		this.staffID = staffID;
	}
}