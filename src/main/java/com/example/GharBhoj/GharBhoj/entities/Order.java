package com.example.GharBhoj.GharBhoj.entities;

import jakarta.persistence.*;
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
    private String orderStatus;
    private String orderLocation;
    @OneToOne
    @JoinColumn(name = "deliverPerson_id")
    private DeliveryPerson deliveryPerson;
    private Long driverRating;
    private Long restaurantRating;

}
