package com.example.payment.entity;



import com.example.payment.entity.dto.OrderDTO;
import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
public class Payment {
    @Id
    @GeneratedValue
    private Integer paymentId;
    @Embedded
    private OrderDTO orderDTO;
    private String method;
}

