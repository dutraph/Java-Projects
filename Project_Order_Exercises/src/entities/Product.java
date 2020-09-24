package entities;

public class Product {

	private String name;
	private Double unityPrice;
	
	public Product() {
	}
	
	public Product(String name, Double unityPrice) {
		super();
		this.name = name;
		this.unityPrice = unityPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getUnityPrice() {
		return unityPrice;
	}

	public void setUnityPrice(Double unityPrice) {
		this.unityPrice = unityPrice;
	}

	
	@Override
	public String toString() {
		return getName();
	}
	

}
