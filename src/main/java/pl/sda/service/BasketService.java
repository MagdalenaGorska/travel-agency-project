package pl.sda.service;

import pl.sda.model.entity.Basket;
import pl.sda.model.entity.Location;

import java.util.List;

public interface BasketService {
    void save(Basket basket);

    Basket getById (Integer id);

    List<Basket> getAll();

    void updateBasket(Basket basket);

    void deleteBasket(Integer id);

}
