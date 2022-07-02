package az.developia.sprindemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	private String model;
	private int price;
	//@Autowired;
	private Cpu cpu;
	//@Autowired
	private Ram ram;
	
	//public Computer(Ram ram,Cpu cpu) {
	//	this.ram=ram;
	//	this.setCpu(cpu);
	//}
	
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
	@Autowired
	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Cpu getCpu() {
		return cpu;
	}
	@Autowired
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	
	
	
	

}
