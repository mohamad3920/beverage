package com.assignment.onlineShop.controller;

import com.assignment.onlineShop.repository.entity.OrderItem;
import com.assignment.onlineShop.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderItemController {
    private final OrderItemService orderItemService;

    @Autowired
    OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @PostMapping
    public OrderItem addOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.save(orderItem);
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.findAll();
    }

    @GetMapping
    public OrderItem getOrderItemById(Long id) {
        return orderItemService.findById(id);
    }

    @PutMapping
    public OrderItem updateOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.save(orderItem);
    }

    @DeleteMapping
    public void deleteOrderItemById(Long id) {
        orderItemService.delete(id);
    }
}
