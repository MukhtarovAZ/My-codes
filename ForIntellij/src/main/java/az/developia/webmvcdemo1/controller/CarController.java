package az.developia.webmvcdemo1.controller;

import az.developia.webmvcdemo1.model.Car;

import az.developia.webmvcdemo1.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

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
        c.setBrand("Ford");
        c.setSpeed(200);
        c.setMadeDate(new Date(1_009_843_200_000L));
        model.addAttribute("car",c);
        model.addAttribute("header","Yeni qeydiyyat");

        return "car-save";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute(name = "car") Car c, BindingResult br){
        if(br.hasErrors()){
            return "car-save";
        }
        if(c.getId()==null){
            carService.save(c);
        }else {
            carService.edit(c);
        }

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

        model.addAttribute("car",c);
        model.addAttribute("header","Masin redaktesi");
        return "car-save";
    }
    @InitBinder
    private void dada(WebDataBinder binder){
        StringTrimmerEditor e=new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,e);

    }


}

