package components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
public class Computer {
private String model;
private int price;
//@Autowired;
private Cpu cpu;
//@Autowired

private static int objectCount=0;

public Computer() {
	objectCount++;
	System.out.println("Computer obyekti sayi="+objectCount);
}

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

public Cpu getCpu() {
	return cpu;
}
@Autowired
public void setCpu(Cpu cpu) {
	this.cpu = cpu;
}





}




