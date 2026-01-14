package com.kisanmitra.repositories;

import com.kisanmitra.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByBuyer_BuyerId(Integer buyerId);
}

