public class DeliveryDriver extends User{
	
	private int driverID;
	private String licence;
	private String car;
	private boolean safetyCheck;
	
	public DeliveryDriver(String name, String email, String phone, String dob, int driverID, String licence, String car){
		super(name, email, phone, dob);
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
	