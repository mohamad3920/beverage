package com.assignment.onlineShop.controller;

import com.assignment.onlineShop.repository.entity.Crate;
import com.assignment.onlineShop.service.CrateService;
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
@RequestMapping("/crate")
public class CrateController {
    private final CrateService crateService;

    @Autowired
    CrateController(CrateService crateService) {
        this.crateService = crateService;
    }

    @GetMapping
    public List<Crate> getAllCrates() {
        return crateService.getAllCrates();
    }

    @GetMapping("/getById")
    public Crate getCrateById(@RequestParam Long id) {
        return crateService.getCrateById(id);
    }

    @PostMapping
    public Crate createCrate(@RequestBody Crate crate) {
        return crateService.saveCrate(crate);
    }

    @PutMapping
    public Crate updateCrate(@RequestBody Crate crate) {
        return crateService.updateCrate(crate);
    }

    @DeleteMapping
    public void deleteCrateById(@RequestParam Long id) {
        crateService.deleteCrate(id);
    }
}
