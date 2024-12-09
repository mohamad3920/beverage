package com.assignment.onlineShop.service;

import com.assignment.onlineShop.repository.OrderRepository;
import com.assignment.onlineShop.repository.entity.ShopOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void save(ShopOrder shopOrder) {
        orderRepository.save(shopOrder);
    }

    public ShopOrder findById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public List<ShopOrder> findAll() {
        return orderRepository.findAll();
    }

    public void delete(Long id) {
        orderRepository.deleteById(id);
    }
}
