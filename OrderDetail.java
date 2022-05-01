public class OrderDetail {
	
	private String orderNo;
	private String restLocation;
	
	public OrderDetail(String orderNo, String restLocation) {
		this.orderNo = orderNo;
		this.restLocation = restLocation;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public String getRestLocation() {
		return restLocation;
	}
	
	public void driverLocation() {}
	
}
