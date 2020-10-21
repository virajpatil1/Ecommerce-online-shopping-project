package shopping.model;
import java.io.Serializable;


public class Product implements Serializable {

	private static final long serialVersionUID = 5186013952828648626L;


	private String productId;
	
	private int quantity;
	

	private String productName;
	

	private double productPrice;




	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	// Constructors
	public Product(String productId, String productCategory, String productDescription, String productManufacturer,
			String productName, double productPrice, String unitStock) {
		super();
		this.productId = productId;
	this.quantity = quantity;
		this.productName = productName;
		this.productPrice = productPrice;
	
	}

	public Product() {

	}

}
