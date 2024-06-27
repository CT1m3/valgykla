package com.example.valgykla.controller;

import com.example.valgykla.model.Menu;
import com.example.valgykla.model.Restaurant;
import com.example.valgykla.service.menu.MenuService;
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
public class MenuController {
    @Autowired
    MenuService menuService;

    @GetMapping("/menus")
    public String menu(Model model) {
        List<Menu> menuList = menuService.findAll();
        model.addAttribute("menuList", menuList);
        model.addAttribute("menu", new Menu());
        return "menus";
    }

    @PostMapping("/menus")
    public String menuSubmit(@ModelAttribute Menu menu, Model model) {
        menuService.save(menu);
        return "redirect:/menus";
    }
    @GetMapping("/menu/delete/{id}")
    public String deleteMenu(@PathVariable("id") int id, Model model){
        menuService.deleteById(id);
        return "redirect:/menus";
    }
    @GetMapping("/menu/edit/{id}")
    public String editmenu(@PathVariable("id") int id, Model model) {
        Optional<Menu> menu = menuService.findById(id);
        model.addAttribute("menu", menu);
        return "edit-menu";
    }
    @PostMapping("/menu/edit")
    public String editMenuSubmit(@ModelAttribute Menu menu) {
        menuService.save(menu);
        return "redirect:/menus";
    }
}
