package com.loseweight.repository.bus;

import com.loseweight.model.bus.Agency;
import com.loseweight.model.bus.Bus;
import com.loseweight.model.bus.Stop;
import com.loseweight.model.bus.Trip;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TripRepository extends CrudRepository<Trip, Long> {
    Trip findBySourceStopAndDestStopAndBus(Stop source, Stop destination, Bus bus);

    List<Trip> findAllBySourceStopAndDestStop(Stop source, Stop destination);

    List<Trip> findByAgency(Agency agency);
}
