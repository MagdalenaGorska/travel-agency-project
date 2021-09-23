package pl.sda.service.impl;

import org.springframework.stereotype.Service;
import pl.sda.model.entity.Basket;
import pl.sda.repository.BasketRepository;
import pl.sda.service.BasketService;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {
    private final BasketRepository basketRepository;

    public BasketServiceImpl(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    @Override
    public void save(Basket basket) {
        basketRepository.save(basket);
    }

    @Override
    public Basket getById(Integer id) {
        return basketRepository.getById(id);
    }

    @Override
    public List<Basket> getAll() {
        return basketRepository.findAll();
    }

    @Override
    public void updateBasket(Basket basket) {
        basketRepository.save(basket);
    }

    @Override
    public void deleteBasket(Integer id) {
        basketRepository.deleteById(id);
    }
}
