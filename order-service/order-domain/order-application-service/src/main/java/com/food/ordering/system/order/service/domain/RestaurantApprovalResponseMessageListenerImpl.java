package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.dto.message.RestaurantApprovalResponse;
import com.food.ordering.system.order.service.domain.ports.input.listener.restaurantapproval.RestaurantApprovalMessageListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
public class RestaurantApprovalResponseMessageListenerImpl implements RestaurantApprovalMessageListener {
	@Override
	public void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse) {

	}

	@Override
	public void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse) {

	}
}
