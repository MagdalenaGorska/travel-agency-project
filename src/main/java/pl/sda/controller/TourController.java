package pl.sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/add") // http://localhost:8080/tour/add
    public String tourForm(@ModelAttribute("tour") Tour tour) {
        return "tour/form";
    }

    @PostMapping("/add") // http://localhost:8080/tour/add
    public String tourAdder(@ModelAttribute("tour") Tour tour) {
        tourRepository.save(tour);
        return "tour/result";
    }

//    @PutMapping("/add")
//    public String tourEdit(@ModelAttribute("tour") Tour tour){
//        return tourRepository.delete(tour);
//    }

    @GetMapping("/list") // http://localhost:8080/tour/list
    public String showList(Model model) {
        List<Tour> tours = tourRepository.findAll();
        model.addAttribute("tours", tours);
        return "tour/list";
    }
}
