package az.developia.webmvcdemo1.controller;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Controller
public class HomeController {
    @GetMapping
    public String showHomePage() {
        return "home";
    }
    @GetMapping("/my-login ")
    public String showLoginPage(){
         return "login";
    }
    @GetMapping("/logout")
    public String showLogoutPage(){
        String username= SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(username);

        return "login";
    }


    @PostMapping ("/auth-user")
    public void  authUser(){
    }




}

