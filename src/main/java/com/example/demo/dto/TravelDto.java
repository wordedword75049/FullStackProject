package com.example.demo.dto;

import com.example.demo.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@AllArgsConstructor
@Getter
public class TravelDto {
    private String name;
    private int user_id;
    private Flight first_flight;
    private Set<String> requirements;
}