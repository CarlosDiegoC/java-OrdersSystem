package com.carlosdiegoc.purchasing.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdiegoc.purchasing.system.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
