package az.developia.webmvcdemo1.controller;

import az.developia.webmvcdemo1.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController{

    @GetMapping("/show-save-page")
    public String showStudentSavePage(Model model){
        Student s=new Student();
       // s.setName("Ramazan");
     //   s.setSurname("Muxtarov");
        model.addAttribute("student",s);

        return "student-save";
    }
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute(name = "student") Student s){
        System.out.println(s.getName());
       return "books";
    }
}