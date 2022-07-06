package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import az.developia.springmvc.model.Student;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	{
		
	}
	
	@GetMapping("/show-save-page")
	public String showStudentSavePAge(Model model) {
		Student s=new Student();
		//s.setName("NIhad");
		//s.setSurname("Sadiqov");
		model.addAttribute("student",s);
		
		return "student-save";
	}
	
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute(name="student")Student s) {
		System.out.println(s.getName());
			 return "books";
	}

}
