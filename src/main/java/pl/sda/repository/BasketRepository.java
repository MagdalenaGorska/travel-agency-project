package pl.sda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.model.entity.Basket;

public interface BasketRepository extends JpaRepository<Basket, Integer> {

}
