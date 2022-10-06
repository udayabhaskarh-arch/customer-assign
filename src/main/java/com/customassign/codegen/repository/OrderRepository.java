package com.customassign.codegen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customassign.codegen.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long>{
    
}
