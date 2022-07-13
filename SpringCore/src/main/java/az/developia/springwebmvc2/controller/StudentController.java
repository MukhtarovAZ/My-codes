package az.developia.springwebmvc2.controller;

import az.developia.springwebmvc2.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String showStudentPage(Model model) {
        List<Student> students=new ArrayList<Student>();
        students.add(new Student(1,"Ramazan","MUxtarov","1312313","Baku"));
        students.add(new Student(2,"Adil","MUxtarov","763675756","Baku"));
        students.add(new Student(3,"Hasan","Aghazade","242325","Baku"));
        students.add(new Student(4,"Murad","MUxtarov","4436265","Baku"));
        model.addAttribute("students",students);
        return "students";
    }
    @GetMapping
    public String showHomePage(){
        return "home";
    }

}

