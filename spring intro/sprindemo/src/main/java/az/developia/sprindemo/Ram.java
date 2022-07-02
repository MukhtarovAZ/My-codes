package az.developia.sprindemo;

import org.springframework.stereotype.Component;

@Component
public class Ram {
	private int size;
	private String model;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	

}
