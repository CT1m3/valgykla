package com.example.valgykla.controller;

import com.example.valgykla.model.Food;
import com.example.valgykla.service.food.FoodService;
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
public class foodController {
    @Autowired
    FoodService foodService;

    @GetMapping("/food")
    public String food(Model model) {
        List<Food> foodList = foodService.findAll();
        model.addAttribute("foodList", foodList);
        model.addAttribute("food", new Food());
        return "food";
    }

    @PostMapping("/food")
    public String menuSubmit(@ModelAttribute Food food, Model model) {
        foodService.save(food);
        return "redirect:/food";
    }
    @GetMapping("/food/delete/{id}")
    public String deleteMenu(@PathVariable("id") int id, Model model){
        foodService.deleteById(id);
        return "redirect:/food";
    }
    @GetMapping("/food/edit/{id}")
    public String editmenu(@PathVariable("id") int id, Model model) {
        Optional<Food> food = foodService.findById(id);
        model.addAttribute("food", food);
        return "edit-food";
    }
    @PostMapping("/food/edit")
    public String editMenuSubmit(@ModelAttribute Food food) {
        foodService.save(food);
        return "redirect:/food";
    }
}
