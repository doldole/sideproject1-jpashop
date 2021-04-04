package com.doldole.sideproject1jpashop.service.query;

import com.doldole.sideproject1jpashop.domain.OrderItem;
import lombok.Getter;

@Getter
public class OrderItemDto {

    private String name;
    private int orderPrice;
    private int count;

    public OrderItemDto(OrderItem orderItem) {
        name = orderItem.getItem().getName();
        orderPrice = orderItem.getOrderPrice();
        count = orderItem.getCount();
    }
}
