package com.pumpkin.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
// The pumpkin table.
@Getter
@Setter
@Entity
@Table(name = "pumpkin")
public class Pumpkin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;
    private Integer amount;
    private String description;
    private String color;
    private String weight;

}