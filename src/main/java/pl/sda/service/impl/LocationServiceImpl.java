package pl.sda.service.impl;

import org.springframework.stereotype.Service;
import pl.sda.model.entity.Location;
import pl.sda.model.entity.Tour;
import pl.sda.repository.LocationRepository;
import pl.sda.service.LocationService;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }


    @Override
    public void save(Location location) {
        locationRepository.save(location);
    }

    @Override
    public Location getById(Integer id) {
        return locationRepository.getById(id);
    }

    @Override
    public List<Location> getAll() {
        return locationRepository.findAll();
    }

    @Override
    public void updateLocation(Location location) {
        locationRepository.save(location);
    }

    @Override
    public void deleteLocation(Integer id) {
        locationRepository.deleteById(id);
    }
}
