package com.example.inventory.entity;

import com.example.inventory.dto.OrderDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity(name = "orders")
@Getter
@Setter
public class Orders {
    @Id
    @GeneratedValue
    private Long orderId;
    private String name;
    private int qty;
    private double price;
    public Orders(OrderDTO order){
        this.orderId = order.getOrderId();
        this.name = order.getName();
        this.qty = order.getQty();
        this.price = order.getPrice();
    }
}
