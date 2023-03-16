package com.carlosdiegoc.purchasing.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdiegoc.purchasing.system.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
