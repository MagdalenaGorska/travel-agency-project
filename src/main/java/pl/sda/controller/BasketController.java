package pl.sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.model.entity.Basket;
import pl.sda.model.entity.Tour;
import pl.sda.service.BasketService;

import java.util.List;

@Controller
@RequestMapping("/basket")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    //uzyskanie listy w koszyku
    @GetMapping("/list") // http://localhost:8080/basket/list
    public String showList(Model model) {
        List<Basket> baskets = basketService.getAll();
        model.addAttribute("baskets", baskets);
        return "basket/list";
    }
}
