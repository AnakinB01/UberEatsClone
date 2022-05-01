public class User{
    // this is the generalised class, which will extend to three classes.
    private String Firstname;
    private String Lastname;
    private String email;
    private int phoneNo;
    private String dateOfBirth;
    
    public User(String firstname, String lastname, String email, int phoneNo, String dateOfBirth) {
        Firstname = firstname;
        Lastname = lastname;
        this.email = email;
        this.phoneNo = phoneNo;
        this.dateOfBirth = dateOfBirth;
    }

    

}