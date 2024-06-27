package com.example.valgykla.service.restaurant;

import com.example.valgykla.model.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {
    List<Restaurant> findAll();

    void save(Restaurant restaurant);

    void deleteById(int id);

    Optional<Restaurant> findById(int id);
}
