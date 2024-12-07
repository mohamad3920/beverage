package com.assignment.onlineShop.service;

import com.assignment.onlineShop.repository.BottleRepository;
import com.assignment.onlineShop.repository.entity.Bottle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BottleService {
    private final BottleRepository bottleRepository;

    @Autowired
    BottleService(BottleRepository bottleRepository) {
        this.bottleRepository = bottleRepository;
    }

    public Bottle save(Bottle bottle) {
        return bottleRepository.save(bottle);
    }

    public List<Bottle> findAll() {
        return bottleRepository.findAll();
    }

    public Bottle findById(Long id) {
        return bottleRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        bottleRepository.deleteById(id);
    }
}
