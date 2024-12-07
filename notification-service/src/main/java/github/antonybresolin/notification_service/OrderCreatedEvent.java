package github.antonybresolin.notification_service;

import java.math.BigDecimal;

public record OrderCreatedEvent(Long orderId, BigDecimal totalAmount) {
}
