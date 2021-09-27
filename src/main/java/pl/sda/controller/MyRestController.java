package pl.sda.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.sda.model.entity.Location;

@RestController
public class MyRestController {
    @PostMapping("/rest-location") // http://localhost:8080/rest-location (metoda POST i dołączona jako JSON location)
    public void add(@Validated @RequestBody Location location) {
    }

    // Metoda dodana, dla przykładu obsługi ogólnego wyjątku
    @GetMapping("/throw-exception") // http://localhost:8080/throw-exception
    public void throwException() {
        throw new RuntimeException("Błąd!");
    }
}

