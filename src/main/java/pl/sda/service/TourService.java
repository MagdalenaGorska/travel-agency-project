package pl.sda.service;

import pl.sda.model.entity.Tour;

import java.util.List;

public interface TourService {
    void save(Tour tour);

    Tour getById (Integer id);

    List<Tour> getAll();

    void updateTour(Tour tour);

    void deleteTour(Integer id);

}
