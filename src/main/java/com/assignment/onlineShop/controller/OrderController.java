package com.assignment.onlineShop.controller;

import com.assignment.onlineShop.repository.entity.ShopOrder;
import com.assignment.onlineShop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<ShopOrder> getAllOrders() {
        return orderService.findAll();
    }

    @GetMapping("/getById")
    public ShopOrder getOrderById(Long id) {
        return orderService.findById(id);
    }

    @PostMapping
    public ShopOrder createOrder(@RequestBody ShopOrder shopOrder) {
        return orderService.save(shopOrder);
    }

    @PutMapping
    public ShopOrder updateOrder(@RequestBody ShopOrder shopOrder) {
        return orderService.save(shopOrder);
    }

    @DeleteMapping
    public void deleteOrderById(Long id) {
        orderService.delete(id);
    }
}
