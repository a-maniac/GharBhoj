package com.example.GharBhoj.GharBhoj.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class FoodItem {
    private Long id;
    private String name;
    private Double price;
}
