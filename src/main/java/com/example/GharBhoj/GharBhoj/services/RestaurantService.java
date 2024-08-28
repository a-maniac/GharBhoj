package com.example.GharBhoj.GharBhoj.services;

import com.example.GharBhoj.GharBhoj.dtos.OrderDto;
import com.example.GharBhoj.GharBhoj.entities.Order;
import org.springframework.http.ResponseEntity;

public interface RestaurantService {

    ResponseEntity<OrderDto> acceptAnOrder(Order order);
    ResponseEntity<OrderDto> cancelAnOrder(Order order);
    ResponseEntity<?> matchDriver(Order order);
}
