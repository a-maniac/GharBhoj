package com.example.GharBhoj.GharBhoj.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Order {

    private Long id;
    private Long orderId;
    private List<String> order;
    private Long price;
    private String orderLocation;
    private Long driverRating;
    private Long restaurantRating;

}
