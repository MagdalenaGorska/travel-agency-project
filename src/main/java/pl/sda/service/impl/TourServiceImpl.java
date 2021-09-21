package pl.sda.service.impl;

import org.springframework.stereotype.Service;
import pl.sda.entity.Tour;
import pl.sda.repository.TourRepository;
import pl.sda.service.TourService;

import java.util.ArrayList;
import java.util.List;

@Service
public class TourServiceImpl implements TourService {

    private List<Tour> tourList = new ArrayList<>();

    private final TourRepository tourRepository;

    public TourServiceImpl(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    @Override
    public void save(Tour tour) {
        tourRepository.save(tour);
    }

    @Override
    public Tour getById(Integer id) {
        return tourRepository.getById(id);
    }

    @Override
    public List<Tour> getAll() {
        return tourRepository.findAll();
    }

    @Override
    public void updateTour(Tour tour) {
        tourRepository.save(tour);
    }

    @Override
    public void deleteTour(Integer id) {
        tourRepository.deleteById(id);
    }
}
