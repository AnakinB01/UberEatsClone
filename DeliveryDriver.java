public class DeliveryDriver extends User{
	
	private int driverID;
	private String licence;
	private String car;
	private boolean safetyCheck;
	
	public DeliveryDriver(String firstname, String lastname, String email, int phoneNo, String dateOfBirth, int driverID, String licence, String car){
		super(firstname, lastname, email, phoneNo, dateOfBirth);
		this.driverID = driverID;
		this.licence = licence;
		this.car = car;
		safetyCheck = false;
	}
	
	public void updateLicence(String updatedLicence) {
		licence = updatedLicence;
	}
	
	public void validateSafety() {
		safetyCheck = true;
	}
	
	public void updateCar(String newCar) {
		car = newCar;
	}
	
	public void acceptOrder() {
		
	}
	
	public void updateLocation() {
		
	}
}
	