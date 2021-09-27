package pl.sda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.model.entity.Location;
import pl.sda.model.entity.Tour;
import pl.sda.service.LocationService;

import java.util.List;

@Controller
@RequestMapping("/location")
public class LocationController {
    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    //przejscie do formularza
    @GetMapping("/add") // http://localhost:8080/location/add
    public String locationForm(@ModelAttribute("location") Location location) {
        return "location/form";
    }

    //dodawanie w formularzu
    @PostMapping("/add") // http://localhost:8080/location/add
    public String locationAdder(@Validated @ModelAttribute("location") Location location, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return"location/form";
        }
        locationService.save(location);
        return "location/result";
    }

    //uzyskanie listy location
    @GetMapping("/list") // http://localhost:8080/location/list
    public String showList(Model model) {
        List<Location> locations = locationService.getAll();
        model.addAttribute("locations", locations);
        return "location/list";
    }
}
