public class ShoppingCart {	
	private String cartNo;
	private Item[] items;
	private String customerID;
	private double cartTotal;
	private String deliverAdd;

	public ShoppingCart(String cartNo, Item[] items, String customerID, double cartTotal, String deliverAdd) {
		this.cartNo = cartNo;
		this.items = items;
		this.customerID = customerID;
		this.cartTotal = cartTotal;
		this.deliverAdd = deliverAdd;
	}
	
	public String getCartNo() {
		return cartNo;
	}

	public Item[] getItems() {
		return items;
	}

	public String getCustomerID() {
		return customerID;
	}

	public double getCartTotal() {
		return cartTotal;
	}

	public String getDeliverAdd() {
		return deliverAdd;
	}

	public void searchFood() {}
	public void addToCart(Item item, int quantity) {}
	public void cancelOrder() {}
	public void modifyCart() {}
	public void removeFromCart(Item item) {}
	public void calculateTotal() {}

}
