package org.madhu.SpringMaven;

public class Tyre {
	private String brand;
	private double price;

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + ", price=" + price + "]";
	}

	public Tyre(String brand) {
		super();
		this.brand = brand;
	}
	

}
