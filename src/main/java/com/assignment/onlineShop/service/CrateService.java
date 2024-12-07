package com.assignment.onlineShop.service;

import com.assignment.onlineShop.repository.CrateRepository;
import com.assignment.onlineShop.repository.entity.Crate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrateService {
    private final CrateRepository crateRepository;

    @Autowired
    CrateService(CrateRepository crateRepository) {
        this.crateRepository = crateRepository;
    }

    public List<Crate> getAllCrates() {
        return crateRepository.findAll();
    }

    public Crate getCrateById(Long id) {
        return crateRepository.findById(id).orElse(null);

    }

    public Crate saveCrate(Crate crate) {
        return crateRepository.save(crate);
    }

    public Crate updateCrate(Crate crate) {
        return crateRepository.save(crate);
    }

    public void deleteCrate(Long id) {
        crateRepository.deleteById(id);
    }
}
