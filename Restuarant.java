public class Restuarant {
    int RestuarantID;
    String name;
    String RestuarantContactNum;
    String location;

    public Restuarant(int restuarantID, String name, String restuarantContactNum, String location) {
        this.RestuarantID = restuarantID;
        this.name = name;
        this.RestuarantContactNum = restuarantContactNum;
        this.location = location;
    }

    public boolean completeOrder(){
        // code for completing order
        return true;
    }
    
    public boolean acceptOrder(){
        // code for accepting the order
        return true;
    }
}
