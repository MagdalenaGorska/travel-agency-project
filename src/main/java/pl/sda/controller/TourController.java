package pl.sda.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import pl.sda.model.entity.Tour;
import pl.sda.repository.TourRepository;
import pl.sda.service.TourService;

import java.util.List;

@Controller
@RequestMapping("/tour")
public class TourController {

    private final TourService tourService;

    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    //przejscie do formularza
    @GetMapping("/add") // http://localhost:8080/tour/add
    public String tourForm(@ModelAttribute("tour") Tour tour) {
        return "tour/form";
    }

    //dodawanie w formularzu
    @PostMapping("/add") // http://localhost:8080/tour/add
    public String tourAdder(@ModelAttribute("tour") Tour tour) {
        tourService.save(tour);
        return "tour/result";
    }

    //uzyskanie listy wycieczek
    @GetMapping("/list") // http://localhost:8080/tour/list
    public String showList(Model model) {
        List<Tour> tours = tourService.getAll();
        model.addAttribute("tours", tours);
        return "tour/list";
    }

    //usuwanie wycieczki
    @PostMapping("/delete")
    public void deleteTour(@RequestParam int id){
        tourService.deleteTour(id);
    }


    //    @PutMapping("/add")
//    public String tourEdit(@ModelAttribute("tour") Tour tour){
//        return tourRepository.delete(tour);
//    }
}
