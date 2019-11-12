package com.example.demo.model;

import javax.persistence.*;

@Entity(name = "TRAVELS")
public class Travel {
    @Id
    long travel_id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "name")
    String name;
}
