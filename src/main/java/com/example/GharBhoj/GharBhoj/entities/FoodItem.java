package com.example.GharBhoj.GharBhoj.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
}
