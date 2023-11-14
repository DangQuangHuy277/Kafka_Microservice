package com.example.payment.kafka;


import com.example.payment.entity.Payment;
import com.example.payment.entity.dto.OrderEvent;
import com.example.payment.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderConsumer {
    private static final Logger logger = LoggerFactory.getLogger(OrderConsumer.class);
    private final PaymentRepository paymentRepository;

    @KafkaListener(
            topics = "${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(@Payload OrderEvent event){
        logger.info(String.format("Order event received in payment service => %s", event.toString()));

        //create payment to that
        Payment payment = Payment.builder()
                .orderDTO(event.getOrder())
                .method("ATM")
                .build();
        paymentRepository.save(payment);
    }
}
