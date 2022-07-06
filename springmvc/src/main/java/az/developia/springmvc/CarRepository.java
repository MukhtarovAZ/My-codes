package az.developia.springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import az.developia.springmvc.model.Car;
@Component
public class CarRepository {
	private List<Car> cars=new ArrayList<Car>();
	{
	cars.add(new Car(1,"Ford",120));
	cars.add(new Car(2,"Kia",200));
	cars.add(new Car(3,"Mercedes",300));
	cars.add(new Car(4,"BMW",500));
	cars.add(new Car(5,"Toyota",400));
	cars.add(new Car(6,"Tesla",4100));
	cars.add(new Car(6,"KIA",1400));
	cars.add(new Car(8,"BMW",43300));
	cars.add(new Car(9,"KIA",1200));
	cars.add(new Car(10,"Toyota",1300));
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	

}
