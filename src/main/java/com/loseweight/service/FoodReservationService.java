package com.loseweight.service;

import com.loseweight.dto.model.bus.FoodDto;
import com.loseweight.model.food.Food;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FoodReservationService {
    Iterable<Food> findAll();

    FoodDto createFood(FoodDto foodDto);
}
