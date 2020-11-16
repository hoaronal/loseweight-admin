package com.loseweight.repository.bus;

import com.loseweight.model.bus.Agency;
import com.loseweight.model.user.User;
import org.springframework.data.repository.CrudRepository;

public interface AgencyRepository extends CrudRepository<Agency, Long> {
    Agency findByCode(String agencyCode);

    Agency findByOwner(User owner);

    Agency findByName(String name);
}
