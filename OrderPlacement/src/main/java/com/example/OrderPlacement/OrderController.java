package com.example.OrderPlacement;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    @GetMapping("/orders")
    public ResponseEntity<?>

    @RequestMapping("/orders")
    public ResponseEntity<?> purchaseOrder()
}
