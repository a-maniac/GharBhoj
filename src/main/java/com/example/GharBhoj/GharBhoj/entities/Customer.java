package com.example.GharBhoj.GharBhoj.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Customer {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
}
