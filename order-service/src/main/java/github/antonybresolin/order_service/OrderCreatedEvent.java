package github.antonybresolin.order_service;

import java.math.BigDecimal;

public record OrderCreatedEvent(Long orderId, BigDecimal totalAmount) {
}
