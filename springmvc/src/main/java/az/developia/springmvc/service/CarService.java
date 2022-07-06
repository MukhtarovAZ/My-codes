package az.developia.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import az.developia.springmvc.CarRepository;
import az.developia.springmvc.model.Car;

@Component
public class CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	
	public List<Car> getAllCars(){
		return carRepository.getCars();
	}

	
}
