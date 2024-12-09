package com.assignment.onlineShop.service;

import com.assignment.onlineShop.repository.BottleRepository;
import com.assignment.onlineShop.repository.CrateRepository;
import com.assignment.onlineShop.repository.entity.Bottle;
import com.assignment.onlineShop.repository.entity.Crate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeverageService {

    private final BottleRepository bottleRepository;

    private final CrateRepository crateRepository;

    @Autowired
    BeverageService(BottleRepository bottleRepository, CrateRepository crateRepository) {
        this.bottleRepository = bottleRepository;
        this.crateRepository = crateRepository;
    }

    public List<Bottle> getAllBottles() {
        return bottleRepository.findAll();
    }

    public List<Crate> getAllCrates() {
        return crateRepository.findAll();
    }
}
