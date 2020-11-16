package com.loseweight.repository.bus;

import com.loseweight.model.bus.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
