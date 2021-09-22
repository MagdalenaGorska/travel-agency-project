package pl.sda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.model.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
