package pl.sda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.entity.Tour;

public interface TourRepository extends JpaRepository<Tour, Integer> {
}
