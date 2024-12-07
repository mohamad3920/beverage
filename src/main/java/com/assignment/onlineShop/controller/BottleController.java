package com.assignment.onlineShop.controller;

import com.assignment.onlineShop.repository.entity.Bottle;
import com.assignment.onlineShop.service.BottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bottle")
public class BottleController {
    private final BottleService bottleService;

    @Autowired
    BottleController(BottleService bottleService) {
        this.bottleService = bottleService;
    }

    @GetMapping
    public List<Bottle> getBottles() {
        return bottleService.findAll();
    }

    @PostMapping
    public Bottle createBottle(@RequestBody Bottle bottle) {
        return bottleService.save(bottle);
    }

    @GetMapping("/getById")
    public Bottle getBottleById(@RequestParam("id") Long id) {
        return bottleService.findById(id);
    }

    @PutMapping
    public Bottle updateBottle(@RequestBody Bottle bottle) {
        return bottleService.save(bottle);
    }

    @DeleteMapping
    public void deleteBottleById(@RequestParam("id") Long id) {
        bottleService.delete(id);
    }
}
