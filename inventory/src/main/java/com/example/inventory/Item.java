package com.example.inventory;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private String name;
    private Double weigh;
}
