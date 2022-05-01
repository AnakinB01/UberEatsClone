public class creditCard extends Payment{
    private String nameOnCard;
    private String numberOnCard;
    private String expiryDate;
    private int cvv;

    public creditCard(String paymentType,int amount,String nameOnCard, String numberOnCard, String expiryDate, int cvv){
        super(paymentType, amount);
        this.nameOnCard = nameOnCard;
        this.numberOnCard = numberOnCard;
        this.expiryDate = expiryDate;
        this.cvv = cvv;

    }
    @Override
    public void makePayment(){
        // code for paying using credit card will go under here
	}
}
