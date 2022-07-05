package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import az.developia.springmvc.model.Car;

@Controller
public class BookController {
	@GetMapping
	public String showHomePage() {
		return "home";
	}
	@GetMapping("/books")
	public String showBooksPage() {
		return "books";
	}

	@GetMapping("/cars")
	public String showCarsPage(Model model) {
		List<Car> cars=new ArrayList<Car>();
		cars.add(new Car(1,"Ford",120));
		cars.add(new Car(2,"Kia",200));
		cars.add(new Car(3,"Mercedes",300));
		cars.add(new Car(4,"BMW",500));
		cars.add(new Car(5,"Toyota",400));
		model.addAttribute("cars",cars);
		
		return "cars";
	}
	

}
