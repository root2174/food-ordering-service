package com.food.ordering.system.kafka.producer.system.order.service.domain.exception;

import com.food.ordering.system.kafka.producer.system.domain.exception.DomainException;

public class OrderNotFoundException extends DomainException {
    public OrderNotFoundException(String message) {
        super(message);
    }

    public OrderNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}