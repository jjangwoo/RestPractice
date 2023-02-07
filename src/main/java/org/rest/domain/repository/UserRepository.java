package org.rest.domain.repository;


import org.rest.domain.model.aggregate.Users;
import org.rest.domain.model.entities.UserId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, UserId> {

}
