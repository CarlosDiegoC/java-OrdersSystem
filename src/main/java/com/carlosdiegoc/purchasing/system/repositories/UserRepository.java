package com.carlosdiegoc.purchasing.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdiegoc.purchasing.system.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
