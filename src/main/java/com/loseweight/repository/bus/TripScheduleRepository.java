package com.loseweight.repository.bus;

import com.loseweight.model.bus.Trip;
import com.loseweight.model.bus.TripSchedule;
import org.springframework.data.repository.CrudRepository;

public interface TripScheduleRepository extends CrudRepository<TripSchedule, Long> {
    TripSchedule findByTripDetailAndTripDate(Trip tripDetail, String tripDate);
}