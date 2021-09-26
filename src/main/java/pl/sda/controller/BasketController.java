package pl.sda.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sda.model.entity.Basket;
import pl.sda.model.entity.Tour;
import pl.sda.model.entity.User;
import pl.sda.service.BasketService;
import pl.sda.service.TourService;
import pl.sda.service.impl.UserServiceImpl;

import java.util.List;

@Controller
public class BasketController {

    private final BasketService basketService;
    private final TourService tourService;
    private final UserServiceImpl userService;

    public BasketController(BasketService basketService, TourService tourService, UserServiceImpl userService) {
        this.basketService = basketService;
        this.tourService = tourService;
        this.userService = userService;
    }

    //uzyskanie listy w koszyku
    @GetMapping("/basket/list") // http://localhost:8080/basket/list
    public String showList(Model model) {
        List<Basket> baskets = basketService.getAll();
        model.addAttribute("baskets", baskets);
        return "/basket/list";
    }

    //dodanie wycieczki do koszyka
    @PostMapping ("/tour/list") // http://localhost:8080/basket/list
    public String addTour(@RequestParam int tourId) {
        Tour tour = tourService.getById(tourId);
        // wybieramy uzytkownika z wykorzystaniem metody getLoggedUser
        User user = getLoggedUser();

        Basket basket = basketService.findBasketForUser(user);
        basket.addTour(tour);
        basketService.save(basket);
        return "/basket/list";
    }

    private User getLoggedUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }


}
