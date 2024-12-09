package com.assignment.onlineShop.service;

import com.assignment.onlineShop.repository.entity.Bottle;
import com.assignment.onlineShop.repository.entity.Crate;
import com.assignment.onlineShop.repository.entity.OrderItem;
import com.assignment.onlineShop.service.model.ShoppingBasket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingBasketService {

    private final ShoppingBasket shoppingBasket;

    @Autowired
    ShoppingBasketService(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    public void addBottleToBasket(Bottle bottle) {
        OrderItem item = new OrderItem();
        item.setPosition(bottle.getName());
        item.setPrice(bottle.getPrice());
        shoppingBasket.addItem(item);
    }

    public void addCrateToBasket(Crate crate) {
        OrderItem item = new OrderItem();
        item.setPosition(crate.getName());
        item.setPrice(crate.getPrice());
        shoppingBasket.addItem(item);
    }

    public List<OrderItem> getBasketItems() {
        return shoppingBasket.getItems();
    }

    public double getTotalPrice() {
        return shoppingBasket.getTotalPrice();
    }

    public void clearBasket() {
        shoppingBasket.clearBasket();
    }
}

