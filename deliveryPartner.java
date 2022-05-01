public class deliveryPartner extends User{
    private String driverID;
    private int license;
    private String car;
    private boolean safetyCheck;

    public deliveryPartner(String firstname, String lastname, String email, int phoneNo, String dateOfBirth,
            String driverID, int license, String car, boolean safetyCheck) {

        super(firstname, lastname, email, phoneNo, dateOfBirth);
        this.driverID = driverID;
        this.license = license;
        this.car = car;
        this.safetyCheck = safetyCheck;
    }

    public void updateLicense(){
       // code for updating license
    }

    public boolean validateSafetyCheck(){
        // code for checking all safety related issues with car and driver
        // by default returns false, will change to true when logic is written.
        return false;
    }

    public void updateCar(){
        // update car details
    }

    public boolean acceptOrder(){
        // code for accepting incoming orders.
        return false;
    }

    public void updateLocation(){
        // code for keeping location updated of the driver.
    }
}
