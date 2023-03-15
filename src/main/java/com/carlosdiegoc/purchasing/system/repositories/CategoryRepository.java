package com.carlosdiegoc.purchasing.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdiegoc.purchasing.system.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
