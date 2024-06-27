package com.example.valgykla.repository;

import com.example.valgykla.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    @Query("SELECT m.name FROM Menu m")
    List<String> findAllMenuNames();
}
