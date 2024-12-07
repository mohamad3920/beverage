package com.assignment.onlineShop.controller;

import com.assignment.onlineShop.repository.entity.Order;
import com.assignment.onlineShop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.findAll();
    }

    @GetMapping("/getById")
    public Order getOrderById(Long id) {
        return orderService.findById(id);
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

    @PutMapping
    public Order updateOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

    @DeleteMapping
    public void deleteOrderById(Long id) {
        orderService.delete(id);
    }
}
