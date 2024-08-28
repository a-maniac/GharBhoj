package com.example.GharBhoj.GharBhoj.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class DeliveryPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;
}
