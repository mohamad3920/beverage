package com.assignment.onlineShop.service.model;

import com.assignment.onlineShop.repository.entity.OrderItem;
import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
@SessionScope
public class ShoppingBasket {
    private final List<OrderItem> items = new ArrayList<>();

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void clearBasket() {
        items.clear();
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(OrderItem::getPrice).sum();
    }
}
