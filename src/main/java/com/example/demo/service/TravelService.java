package com.example.demo.service;

import com.example.demo.model.Travel;
import com.example.demo.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService {
    @Autowired
    private final TravelRepository repository;

    @Autowired
    public TravelService(TravelRepository repository) {
        this.repository = repository;
    }

    public List<Travel> getAll(){
        List<Travel> users = repository.findAll();
        return users;
    }
}