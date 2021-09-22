package pl.sda.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class AuthenticationController {

    @GetMapping("/login")
    public String loginPage(){
        return "login"; //odeslij do przegladarki plik login.html
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response){

        final Authentication autentication = SecurityContextHolder.getContext().getAuthentication();

        if(autentication != null){
            new SecurityContextLogoutHandler().logout(request, response, autentication);
        }
        return "redirect:/login";
    }
}