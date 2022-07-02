package az.developia.sprindemo;

import org.springframework.stereotype.Component;

@Component
public class Computer {
	private String model;
	private int price;
	private Ram ram;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	
	
	
	

}
