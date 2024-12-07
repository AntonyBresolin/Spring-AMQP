package github.antonybresolin.cashback_service;

import java.math.BigDecimal;

public record OrderCreatedEvent(Long orderId, BigDecimal totalAmount) {
}
