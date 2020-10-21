package shopping.model;

import java.io.Serializable;

public class shopping_cart implements Serializable {


	private int cartId;
	private int productId;
	private int quantity;

	
	private List<CartItem> cartItem;

	private double totalPrice;

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public Customer getproductId() {
		return productId;
	}

	public void setproductId(Customer productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



}