package com.assignment.onlineShop.controller;

import com.assignment.onlineShop.service.ShoppingBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basket")
public class ShoppingBasketController {

    private final ShoppingBasketService shoppingBasketService;

    @Autowired
    ShoppingBasketController(ShoppingBasketService shoppingBasketService) {
        this.shoppingBasketService = shoppingBasketService;
    }

    @GetMapping
    public String showBasket(Model model) {
        model.addAttribute("items", shoppingBasketService.getBasketItems());
        model.addAttribute("totalPrice", shoppingBasketService.getTotalPrice());
        return "basket";
    }

    @PostMapping("/submitOrder")
    public String submitOrder(Model model) {
        // Implement actual order submission logic here
        shoppingBasketService.clearBasket();
        model.addAttribute("message", "Order submitted successfully!");
        return "orderConfirmation";
    }
}

