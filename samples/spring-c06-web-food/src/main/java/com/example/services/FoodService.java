package com.example.services;

import com.example.entities.Food;

import java.util.List;
import java.util.Optional;

public interface FoodService {

    // crud
    List<Food> findAll();
    Optional<Food> findById(Long id);
    List<Food> findAllByCategory(String category);
    List<Food> findAllByColor(String color);
    List<Food> findAllByCategoryAndColor(String category, String color);
    Food save(Food food);
    void deleteById(Long id);

    // lógica de negocio
}
