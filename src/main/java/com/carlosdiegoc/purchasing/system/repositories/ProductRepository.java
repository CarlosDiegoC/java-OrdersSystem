package com.carlosdiegoc.purchasing.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdiegoc.purchasing.system.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
