package github.antonybresolin.cashback_service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {
    @RabbitListener(queues = "orders.v1.order-created")
    public void onOrderCreated(Message message) {
        System.out.println("Received message: " + new String(message.getBody()));
    }
}
