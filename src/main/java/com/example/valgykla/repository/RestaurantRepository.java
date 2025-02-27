package com.example.valgykla.repository;

import com.example.valgykla.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
    List<Restaurant> findByNameContainingIgnoreCase(String query);
}
