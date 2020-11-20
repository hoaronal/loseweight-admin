package com.loseweight.service;

import com.loseweight.dto.model.bus.FoodDto;
import java.util.List;

import com.loseweight.model.food.Food;
import com.loseweight.repository.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodReservationServiceImpl implements FoodReservationService{

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public FoodDto createFood(FoodDto foodDto) {
        Food foodModel = new Food().setName(foodDto.getName())
                .setDescription(foodDto.getDescription())
                .setCalo(foodDto.getCalo())
                .setCode(foodDto.getCode())
                .setCooking_time(foodDto.getCooking_time())
                .setPrepare_time(foodDto.getPrepare_time())
                .setTotal_like(foodDto.getTotal_like())
                .setRecommend_level(foodDto.getRecommend_level())
                .setImage(foodDto.getImage());;

        foodRepository.save(foodModel);
        return foodDto;
    }

    @Override
    public Iterable<Food> findAll() {
        return foodRepository.findAll();
    }
}
