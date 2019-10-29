package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "TRAVELS")
public class Travel {
    @Id
    long travel_id;
    @Id
    long user_id;
    @Column(name = "name")
    String name;
}
