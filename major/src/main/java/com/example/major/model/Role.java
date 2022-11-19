package com.example.major.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer Id;
    @Column(nullable = false,unique = true)
    @NotEmpty
    private String name;
    @ManyToMany
    private List<User> users;
}
