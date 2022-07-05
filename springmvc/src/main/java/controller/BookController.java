package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	
	@GetMapping("/books")
	public String showBooksPage() {
		return "books";
	}
	
	@GetMapping
	public String showHomePage() {
		return "home";
	}
	
	@GetMapping("/cars")
	public String showCarsPage() {
		return "cars";
	}
	

}
