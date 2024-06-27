package com.example.valgykla.service.food;

import com.example.valgykla.model.Food;

import java.util.List;
import java.util.Optional;

public interface FoodService {
    List<Food> findAll();

    void save(Food food);

    void deleteById(int id);

    Optional<Food> findById(int id);
}
