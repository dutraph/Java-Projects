package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem() {
	}
	
	public OrderItem(Product product, Integer quantity, Double price) {
		this.quantity = quantity;
		this.product = product;
		this.price = price;
	}


	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return quantity * price;
	}
	
	@Override
	public String toString() {
		return ""+ getProduct() + ", "+ price + ", Qty. " + getQuantity() + ", Subtotal: " + subTotal();
	}
}
