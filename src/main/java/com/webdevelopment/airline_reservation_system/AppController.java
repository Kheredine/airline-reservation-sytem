package com.webdevelopment.airline_reservation_system;

/* import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController; */
import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/* import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 */
@Controller
public class AppController {
    /*
     * @Autowired
     * private UserRepository repo;
     */

    @GetMapping("")
    public String signInPage() {
        return "signIn";
    }

    @GetMapping("/logout")
    public String logoutPage() {
        return "signIn";
    }

    @GetMapping("/signUp")
    public String signUpPage() {
        return "signUp";
    }

    @GetMapping("/flight")
    public String flightPage() {
        return "flight";
    }

    @GetMapping("/reservation")
    public String reservationPage() {
        return "reservation";
    }

    /*
     * @GetMapping("/signIn")
     * public String signInPage2() {
     * return "signIn";
     * }
     * 
     * @GetMapping("/signUp")
     * public String signUpPage(Model model) {
     * model.addAttribute("user", new User());
     * 
     * return "signUp";
     * }
     * 
     * @GetMapping("/index")
     * public String homePage() {
     * return "index";
     * }
     * 
     * @PostMapping("/register_user")
     * public String registerUser(User user) {
     * repo.save(user);
     * 
     * return "signIn";
     * }
     * 
     * @RestController
     * public class IndexController implements ErrorController {
     * 
     * private static final String PATH = "/error";
     * 
     * @RequestMapping(value = PATH)
     * public String error() {
     * return "Error handling";
     * }
     * }
     */
}
