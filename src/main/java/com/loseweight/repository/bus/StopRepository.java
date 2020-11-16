package com.loseweight.repository.bus;

import com.loseweight.model.bus.Stop;
import org.springframework.data.repository.CrudRepository;

public interface StopRepository extends CrudRepository<Stop, Long> {
    Stop findByCode(String code);
}
