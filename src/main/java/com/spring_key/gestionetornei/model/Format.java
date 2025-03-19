package com.spring_key.gestionetornei.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Format {
    @ManyToOne
    private CardGame cardGame;
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
