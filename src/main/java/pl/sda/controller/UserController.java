package pl.sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.model.entity.User;
import pl.sda.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    /*@PostMapping("/register") // http://localhost:8080/user/register
    public String register(@ModelAttribute("user") User user) {
        userService.encodePassword(user);
        user.setRole("USER");
        userService.save(user);
        return "registration-success";
    }*/
    @GetMapping("/register")
    public String getRegisterForm() {
        return "user/register-form";
    }

    @PostMapping("/register")
    public String processRegistration(@ModelAttribute User user) {
        userService.encodePassword(user);
        userService.save(user);
        return "user/register-result";
    }

}
