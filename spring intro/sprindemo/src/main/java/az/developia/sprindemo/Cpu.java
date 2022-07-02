package az.developia.sprindemo;

import org.springframework.stereotype.Component;

@Component
public class Cpu {
	
private int speed;
public Cpu() {
	
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}


}
