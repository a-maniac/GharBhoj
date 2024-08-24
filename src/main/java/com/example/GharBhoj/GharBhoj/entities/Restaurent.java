package com.example.GharBhoj.GharBhoj.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Restaurent {

    private Long id;
    private String name;
    private String address;
    private Long rating;
}
