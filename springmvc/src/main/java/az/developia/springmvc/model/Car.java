package az.developia.springmvc.model;

public class Car {
private Integer id;
private String brand;
private Integer Speed;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Integer getSpeed() {
	return Speed;
}
public void setSpeed(Integer speed) {
	Speed = speed;
}
public Car(Integer id, String brand, Integer speed) {
	super();
	this.id = id;
	this.brand = brand;
	Speed = speed;
}



}
