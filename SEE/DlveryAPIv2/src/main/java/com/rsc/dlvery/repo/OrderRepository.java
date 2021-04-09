package com.rsc.dlvery.repo;

import java.util.List;

import com.rsc.dlvery.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    
    @Query("select o from com.rsc.dlvery.entity.Order o where o.id= :id")
    public List<Order> getOrders(int id);
}
