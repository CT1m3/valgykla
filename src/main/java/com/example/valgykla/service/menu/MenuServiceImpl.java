package com.example.valgykla.service.menu;

import com.example.valgykla.model.Menu;
import com.example.valgykla.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> findAll() {
        return menuRepository.findAll();
    }

    @Override
    public void save(Menu menu) {
        menuRepository.save(menu);
    }

    @Override
    public void deleteById(int id) {
        menuRepository.deleteById(id);
    }

    @Override
    public Optional<Menu> findById(int id) {
        return menuRepository.findById(id);
    }

    @Override
    public List<String> findAllMenuNames() {
        return menuRepository.findAllMenuNames();
    }
}
