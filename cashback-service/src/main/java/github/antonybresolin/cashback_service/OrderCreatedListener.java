package github.antonybresolin.cashback_service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {
    @RabbitListener(queues = "orders.v1.order-created.generate-cashback")
    public void onOrderCreated(OrderCreatedEvent event) {
        System.out.println("Received message ID: " + event.orderId());
        System.out.println("Received message Value: " + event.totalAmount());
    }
}
