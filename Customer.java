package shopping.model;

import java.io.Serializable;


public class Customer implements Serializable {

	
	private String customerName;
	private String email;
	private String creditcaedinfo;
	private String shippindinfo;

	
	private ShippingAddress shippingAddress;

	private BillingAddress billingAddress;

	private User users;


	private Cart cart;

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	


	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getcustomerName() {
		return customerName;
	}

	public void setcustomerName(String firstName) {
		this.customerName = customerName;
	}

	public String getcreditcaedinfo() {
		return creditcaedinfo;
	}
	
	public void setshippindinfo(String shippindinfo) {
		this.shippindinfo = shippindinfo;
	}
	public String getshippindinfo() {
		return shippindinfo;
	}
	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

}