package pl.sda.service;

import pl.sda.model.entity.Basket;
import pl.sda.model.entity.Location;
import pl.sda.model.entity.Tour;
import pl.sda.model.entity.User;

import java.util.List;

public interface BasketService {
    void save(Basket basket);

    Basket getById (Integer id);

    List<Basket> getAll();

    void updateBasket(Basket basket);

    void deleteBasket(Integer id);

    Basket findBasketForUser(User user);

}
