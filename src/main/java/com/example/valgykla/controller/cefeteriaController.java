package com.example.valgykla.controller;

import com.example.valgykla.model.Food;
import com.example.valgykla.model.Menu;
import com.example.valgykla.model.Restaurant;
import com.example.valgykla.service.food.FoodService;
import com.example.valgykla.service.menu.MenuService;
import com.example.valgykla.service.restaurant.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class cefeteriaController {

    @Autowired
    RestaurantService restaurantService;

    @Autowired
    FoodService foodService;

    @GetMapping("/cafeteria")
    public String cafeteria(Model model) {
        List<Restaurant> restaurantList = restaurantService.findAll();
        model.addAttribute("restaurantList", restaurantList);
        return "cafeteria";
    }
    @GetMapping("/cafeteria/search")
    public String searchRestaurants(@RequestParam("query") String query, Model model) {
        List<Restaurant> filteredRestaurants = restaurantService.findRestaurantByName(query);
        model.addAttribute("restaurantList", filteredRestaurants);
        return "cafeteria";
    }
    @GetMapping("/restaurant/view/{id}")
    public String view(@PathVariable("id") int id, Model model) {
        List<Food> foodList = foodService.findAll();
        model.addAttribute("foodList", foodList);
        model.addAttribute("food", new Food());
        return "view";
    }
}
