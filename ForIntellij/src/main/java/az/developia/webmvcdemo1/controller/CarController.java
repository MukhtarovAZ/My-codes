package az.developia.webmvcdemo1.controller;

import az.developia.webmvcdemo1.model.Car;

import az.developia.webmvcdemo1.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        System.out.println(c);
        if(c.getId()==null){
            carService.save(c);
        }else {
            carService.edit(c);
        }
        carService.save(c);

        return "redirect:/cars/list;";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        carService.deleteById(id);
        return "redirect:/cars/list;";
    }
    @GetMapping("/edit/{id}")
    public String showEditPage(@PathVariable Integer id,Model model) {
        Car c=carService.findById(id);
        System.out.println(c);
        model.addAttribute("car",c);
        return "car-save";
    }


}

