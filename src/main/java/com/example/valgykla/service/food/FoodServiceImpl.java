package com.example.valgykla.service.food;

import com.example.valgykla.model.Food;
import com.example.valgykla.model.Menu;
import com.example.valgykla.repository.FoodRepository;
import com.example.valgykla.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodServiceImpl implements FoodService{
    @Autowired
    private FoodRepository foodRepository;

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    @Override
    public void save(Food food) {
        foodRepository.save(food);
    }

    @Override
    public void deleteById(int id) {
        foodRepository.deleteById(id);
    }

    @Override
    public Optional<Food> findById(int id) {
        return foodRepository.findById(id);
    }

}
