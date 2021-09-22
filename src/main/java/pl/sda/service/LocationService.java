package pl.sda.service;

import pl.sda.model.entity.Location;
import pl.sda.model.entity.Tour;

import java.util.List;

public interface LocationService {
    void save(Location location);

    Location getById (Integer id);

    List<Location> getAll();

    void updateLocation(Location location);

    void deleteLocation(Integer id);
}
