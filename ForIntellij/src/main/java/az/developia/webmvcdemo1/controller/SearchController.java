package az.developia.webmvcdemo1.controller;

import az.developia.webmvcdemo1.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {

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

    @GetMapping("/search")
    public String showSearchPage(Model model,
                                 @RequestParam(name="carBrand")String carBrand) {
        List<Car> filteredCars=new ArrayList<Car>();
        for (Car car : cars) {
            if(car.getBrand().equals(carBrand)) {
                filteredCars.add(car);
            }
        }
        model.addAttribute("cars",filteredCars);
        return "cars";
    }

}

