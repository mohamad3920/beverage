package com.assignment.onlineShop.controller;

import com.assignment.onlineShop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    @Autowired
    CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public String showBasket(Model model) {
        model.addAttribute("items", cartService.getBasketItems());
        model.addAttribute("totalPrice", cartService.getTotalPrice());
        return "cart";
    }

    @PostMapping("/submitOrder")
    public String submitOrder(Model model) {
        // Implement actual order submission logic here
        cartService.clearBasket();
        model.addAttribute("message", "Order submitted successfully!");
        return "orderConfirmation";
    }

    @PostMapping("/remove/{id}")
    public String removeCart(@PathVariable Long id) {
        cartService.removeItemFromBasket(id);
        return "redirect:/cart";
    }
}

