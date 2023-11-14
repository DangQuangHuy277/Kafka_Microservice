package com.example.inventory.kafka;

import com.example.inventory.dto.OrderEvent;
import com.example.inventory.entity.Orders;
import com.example.inventory.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderConsumer {
    private final OrderRepository orderRepository;
    private static final Logger logger = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(
            topics = "${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(OrderEvent event){
        logger.info(String.format("Order event received in inventory service => %s", event.toString()));

        // save the order event into the database
        orderRepository.save(new Orders(event.getOrder()));
    }
}
