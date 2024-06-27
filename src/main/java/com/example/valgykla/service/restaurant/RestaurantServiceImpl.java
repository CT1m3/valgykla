package com.example.valgykla.service.restaurant;

import com.example.valgykla.model.Restaurant;
import com.example.valgykla.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;
    @Override
    public List<Restaurant> findAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public void save(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }

    @Override
    public void deleteById(int id) {
        restaurantRepository.deleteById(id);
    }

    @Override
    public Optional<Restaurant> findById(int id) {
        return restaurantRepository.findById(id);
    }
    @Override
    public List<Restaurant> findRestaurantByName(String query) {
        return restaurantRepository.findByNameContainingIgnoreCase(query);
    }
}
