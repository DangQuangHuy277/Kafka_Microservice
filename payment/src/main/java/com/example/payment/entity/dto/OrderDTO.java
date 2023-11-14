package com.example.payment.entity.dto;

import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OrderDTO {
    private Long orderId;
    private String name;
    private int qty;
    private double price;
}
