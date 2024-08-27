package com.example.GharBhoj.GharBhoj.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;
    private List<String> order;
    private Long price;
    private String orderLocation;
    private Long driverRating;
    private Long restaurantRating;

}
