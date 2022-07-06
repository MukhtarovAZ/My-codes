package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import az.developia.springmvc.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
	
	@Autowired
	private  CarService carService;
	
	
	@GetMapping("/list")
	public String showCarsPage(Model model) {
		model.addAttribute("cars", carService.getAllCars());
		return "cars";
	}

}
