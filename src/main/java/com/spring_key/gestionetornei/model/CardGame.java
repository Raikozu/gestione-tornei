package com.spring_key.gestionetornei.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class CardGame {
    @ManyToOne
    private Business business;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy ="cardGame")
    private List<Format> formats;

}
