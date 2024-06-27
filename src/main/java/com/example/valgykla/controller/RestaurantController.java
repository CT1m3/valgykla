package com.example.valgykla.controller;

import com.example.valgykla.model.Restaurant;
import com.example.valgykla.service.restaurant.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @GetMapping("/restaurants")
    public String restaurant(Model model) {
        List<Restaurant> restaurantList = restaurantService.findAll();
        model.addAttribute("restaurantList", restaurantList);
        model.addAttribute("restaurant", new Restaurant());
        return "restaurants";
    }

    @PostMapping("/restaurants")
    public String restaurantSubmit(@ModelAttribute Restaurant restaurant, Model model) {
        restaurantService.save(restaurant);
        return "redirect:/restaurants";
    }
    @GetMapping("/restaurant/delete/{id}")
    public String deleteRestaurant(@PathVariable("id") int id, Model model){
        restaurantService.deleteById(id);
        return "redirect:/restaurants";
    }
    @GetMapping("/restaurant/edit/{id}")
    public String editRestaurant(@PathVariable("id") int id, Model model) {
        Optional<Restaurant> restaurant = restaurantService.findById(id);
        model.addAttribute("restaurant", restaurant);
        return "edit-restaurant";
    }
    @PostMapping("/restaurant/edit")
    public String editRestaurantSubmit(@ModelAttribute Restaurant restaurant) {
        restaurantService.save(restaurant);
        return "redirect:/restaurants";
    }
}
