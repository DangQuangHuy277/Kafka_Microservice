package com.example.OrderPlacement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private Double price;

    private OrderItem item;
}
