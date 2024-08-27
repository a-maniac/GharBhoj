package com.example.GharBhoj.GharBhoj.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Menu {
    private Long id;
    private FoodItem item;
}
