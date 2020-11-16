package com.loseweight.repository.user;

import com.loseweight.model.user.Role;
import com.loseweight.model.user.UserRoles;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRole(UserRoles role);

}
