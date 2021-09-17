package pl.sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.entity.Tour;
import pl.sda.repository.TourRepository;

import java.util.List;

@Controller
@RequestMapping("/tour")
public class TourController {

    private final TourRepository tourRepository;

    public TourController(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    @PostMapping("/add") // http://localhost:8080/tour/add
    public String tourAdder(@ModelAttribute("tour") Tour tour) {
        tourRepository.save(tour);
        return "tour/result";
    }

    @GetMapping("/list") // http://localhost:8080/tour/list
    public String showList(Model model) {
        List<Tour> tours = tourRepository.findAll();
        model.addAttribute("tours", tours);
        return "tour/list";
    }
}
