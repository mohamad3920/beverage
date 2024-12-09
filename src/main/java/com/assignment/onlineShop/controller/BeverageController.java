package com.assignment.onlineShop.controller;

import com.assignment.onlineShop.repository.entity.Bottle;
import com.assignment.onlineShop.repository.entity.Crate;
import com.assignment.onlineShop.service.BeverageService;
import com.assignment.onlineShop.service.ShoppingBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BeverageController {

    private final BeverageService beverageService;

    private final ShoppingBasketService shoppingBasketService;

    @Autowired
    BeverageController(BeverageService beverageService, ShoppingBasketService shoppingBasketService) {
        this.beverageService = beverageService;
        this.shoppingBasketService = shoppingBasketService;
    }

    @GetMapping
    public String showHomePage(Model model) {
        model.addAttribute("bottles", beverageService.getAllBottles());
        model.addAttribute("crates", beverageService.getAllCrates());
        return "index";
    }

    @PostMapping("/addBottle/{id}")
    public String addBottleToBasket(@PathVariable Long id) {
        Bottle bottle = beverageService.getAllBottles().stream()
                .filter(b -> b.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Bottle not found"));
        shoppingBasketService.addBottleToBasket(bottle);
        return "redirect:/";
    }

    @PostMapping("/addCrate/{id}")
    public String addCrateToBasket(@PathVariable Long id) {
        Crate crate = beverageService.getAllCrates().stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Crate not found"));
        shoppingBasketService.addCrateToBasket(crate);
        return "redirect:/";
    }
}
