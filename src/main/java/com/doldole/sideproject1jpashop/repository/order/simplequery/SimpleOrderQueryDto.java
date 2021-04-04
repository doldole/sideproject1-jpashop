package com.doldole.sideproject1jpashop.repository.order.simplequery;

import com.doldole.sideproject1jpashop.domain.Address;
import com.doldole.sideproject1jpashop.domain.Order;
import com.doldole.sideproject1jpashop.domain.OrderStatus;
import lombok.Data;

import java.awt.*;
import java.time.LocalDateTime;

@Data
public class SimpleOrderQueryDto {
    private Long orderId;
    private String name;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private Address address;

    public SimpleOrderQueryDto(Long orderId, String name, LocalDateTime orderDate, OrderStatus orderStatus, Address address) {
        this.orderId = orderId;
        this.name = name;        // LAZY 초기화
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.address = address;     // LAZY 초기화
    }
}
