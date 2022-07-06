package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import az.developia.springmvc.model.Car;
@Controller
public class SearchController {
	
	List<Car> cars=new ArrayList<Car>();
	{
	
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
