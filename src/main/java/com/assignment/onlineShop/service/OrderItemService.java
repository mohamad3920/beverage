package com.assignment.onlineShop.service;

import com.assignment.onlineShop.repository.OrderItemRepository;
import com.assignment.onlineShop.repository.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {
    private final OrderItemRepository orderItemRepository;

    @Autowired
    OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public OrderItem save(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public List<OrderItem> findAll() {
        return orderItemRepository.findAll();
    }

    public OrderItem findById(Long id) {
        return orderItemRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        orderItemRepository.deleteById(id);
    }
}
