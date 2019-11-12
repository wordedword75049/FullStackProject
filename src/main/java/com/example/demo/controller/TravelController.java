package com.example.demo.controller;

import com.example.demo.model.Travel;
import com.example.demo.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelController {
    @Autowired
    private TravelService service;

    @GetMapping("/alltravels")
    public List<Travel> alltravels() {
        return service.getAll();
    }
}
