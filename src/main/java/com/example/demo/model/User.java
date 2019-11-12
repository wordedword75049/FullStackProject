package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "USERS")
public class User {
    @Id
    long id;
    @Column(name = "name")
    String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Travel> attachments = new HashSet<Travel>();
}
