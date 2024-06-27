package com.example.valgykla.service.menu;

import com.example.valgykla.model.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuService {
    List<Menu> findAll();

    void save(Menu menu);

    void deleteById(int id);

    Optional<Menu> findById(int id);

    List<String> findAllMenuNames();
}
