package pl.sda.service;

import pl.sda.entity.Tour;

public interface TourService {
    void save(Tour tour);

    void update(Tour tour);

    void delete(Integer id);
}
