package com.food.ordering.system.kafka.producer.system.order.service.domain.valueobject;

import com.food.ordering.system.kafka.producer.system.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
