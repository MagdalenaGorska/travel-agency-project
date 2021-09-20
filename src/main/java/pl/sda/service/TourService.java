package pl.sda.service;

import pl.sda.entity.Tour;

import java.util.List;

public interface TourService {
    void save(Tour tour);

    Tour getById (Integer id);

    List<Tour> getAll();

    void update(Tour tour);

    void delete(Tour tour);

}
