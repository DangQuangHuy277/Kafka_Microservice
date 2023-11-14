package com.example.orderplacement.dto;


import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long orderId;
    private String name;
    private int qty;
    private double price;
}