package com.ant.ant.services;

import com.ant.ant.dao.repository.PriceRepository;
import com.ant.ant.dto.models.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {
    private final PriceRepository priceRepository;

    @Autowired
    public PriceService(final PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public void save(Price price){
        priceRepository.save(price);
    }

    public List<Price> findAll(){
        return priceRepository.findAll();
    }

    public void deleteByName(String name){
        priceRepository.deleteByName(name);
    }
}
