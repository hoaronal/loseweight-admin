package com.loseweight.repository.bus;

import com.loseweight.model.bus.Agency;
import com.loseweight.model.bus.Bus;
import org.springframework.data.repository.CrudRepository;

public interface BusRepository extends CrudRepository<Bus, Long> {
    Bus findByCode(String busCode);

    Bus findByCodeAndAgency(String busCode, Agency agency);
}
