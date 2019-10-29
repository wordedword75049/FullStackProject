package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "USERS")
public class User {
    @Id
    long id;
    @Column(name = "name")
    String name;
}
