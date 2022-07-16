package az.developia.webmvcdemo1.service;
import az.developia.webmvcdemo1.model.Car;
import az.developia.webmvcdemo1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;


    public List<Car> getAllCars(){
        return carRepository.getCars();
    }
    public void save(Car c){
        carRepository.save(c);
    }


}

