package com.hussainsaifuddin.orderservice.repository;

import com.hussainsaifuddin.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
