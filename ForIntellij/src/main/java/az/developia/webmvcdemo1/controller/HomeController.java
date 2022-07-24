package az.developia.webmvcdemo1.controller;

import az.developia.webmvcdemo1.model.Car;
import az.developia.webmvcdemo1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.sql.DataSource;
import javax.validation.Valid;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.Statement;
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")

@Controller
public class HomeController {
    @GetMapping
    public String showHomePage() {
        return "home";
    }

    @GetMapping("/my-login ")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("/logout")
    public String showLogoutPage() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(username);
        return "login";
    }

    @PostMapping("/auth-user")
    public void authUser() {
    }

    @GetMapping("/creat-account")
    public String showCreateAccountPage(Model m) {
        User user = new User();
        m.addAttribute("user", user);
        return "creat-account";
    }
    @Autowired
    private DataSource dataSource;
    @PostMapping("/create-account-save")
    @PreAuthorize(value = "hasAuthority('save:car')")
    public String save(@ModelAttribute(name = "user") User user) {

        try {
            Connection conn = dataSource.getConnection();
            Statement st = conn.createStatement();

            Statement stm = conn.createStatement();
            st.executeUpdate("insert into users "
        +"(username,password,enabled) ) values "
                +"('"+user.getUsername()+"','{noop}"+user.getPassword()+"',1);");

            st.executeUpdate("insert into authorities"
                    +"(username,authority) ) values "
                    +"('"+user.getUsername()+"','abc'),('"+user.getUsername()+"','list:cars'); ");


            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


        return "login";
    }
}


