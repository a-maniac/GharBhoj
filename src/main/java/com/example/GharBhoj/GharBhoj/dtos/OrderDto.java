package com.example.GharBhoj.GharBhoj.dtos;

import lombok.Data;

import java.util.List;

@Data
public class OrderDto {

    private Long orderId;
    private List<String> order;
    private Long price;
    private String orderLocation;
    private Long driverRating;
    private Long restaurantRating;
    private String orderStatus;
}
