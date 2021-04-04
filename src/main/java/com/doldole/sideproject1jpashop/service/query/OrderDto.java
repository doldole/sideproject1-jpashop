package com.doldole.sideproject1jpashop.service.query;

import com.doldole.sideproject1jpashop.domain.Address;
import com.doldole.sideproject1jpashop.domain.Order;
import com.doldole.sideproject1jpashop.domain.OrderItem;
import com.doldole.sideproject1jpashop.domain.OrderStatus;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Getter
public class OrderDto {
    private Long orderId;
    private String name;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private Address address;
    private List<OrderItemDto> orderItems;

    public OrderDto(Order order) {
        orderId = order.getId();
        name = order.getMember().getName();
        orderDate = order.getOrderDate();
        orderStatus = order.getStatus();
        address = order.getDelivery().getAddress();
        orderItems = order.getOrderItems().stream()
                .map(orderItem -> new OrderItemDto(orderItem))
                .collect(toList());
    }
}
