package az.developia.webmvcdemo1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {


    @GetMapping("/list")
    public String showBooksPage() {
        return "books";
    }

}