package com.loseweight.repository.food;
import com.loseweight.dto.model.bus.FoodDto;
import com.loseweight.model.bus.Bus;
import com.loseweight.model.food.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long>{
    List<Food> findByNameContaining(String name);
}
