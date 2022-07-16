package az.developia.webmvcdemo1.controller;

import az.developia.webmvcdemo1.model.Car;
import az.developia.webmvcdemo1.model.Student;
import az.developia.webmvcdemo1.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;


    @GetMapping("/list")
    public String showCarsPage(Model model) {
        model.addAttribute("cars", carService.getAllCars());
        return "cars";
    }
    @GetMapping("/show-save-page")
    public String showSavePage(Model model){
        Car c=new Car();

        model.addAttribute("car",c);

        return "car-save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute(name = "car") Car c){

        carService.save(c);

        return "redirect:/cars/list;";
    }

}

