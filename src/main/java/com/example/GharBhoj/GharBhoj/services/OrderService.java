package com.example.GharBhoj.GharBhoj.services;

import com.example.GharBhoj.GharBhoj.dtos.OrderDto;
import com.example.GharBhoj.GharBhoj.entities.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    ResponseEntity<OrderDto> placeAnOrder(Order order);

    ResponseEntity<OrderDto> cancelAnOrder(Order order);

    ResponseEntity<OrderDto> changeAddress(Order order);

}
