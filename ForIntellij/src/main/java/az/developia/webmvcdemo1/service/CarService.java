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
    public void deleteById(Integer id){
        carRepository.deleteById(id);
    }

    public Car findById(Integer id){
        return carRepository.findById(id);
    }


    public void edit(Car c) {
        carRepository.edit(c);
    }

    public Object searchCars(String brand) {
        return carRepository.searchCars(brand);
    }
}

