package com.assignment.onlineShop.service;

import com.assignment.onlineShop.repository.CrateRepository;
import com.assignment.onlineShop.repository.entity.Crate;
import com.assignment.onlineShop.service.mapper.CrateMapper;
import com.assignment.onlineShop.service.model.CrateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public CrateDto getCrateById(Long id) {
        Crate crate = crateRepository.findById(id).orElseThrow(() -> new RuntimeException("Entity not found"));
        return CrateMapper.INSTANCE.toDto(crate);
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
