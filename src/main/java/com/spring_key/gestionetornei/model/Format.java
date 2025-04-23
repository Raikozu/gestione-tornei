package com.spring_key.gestionetornei.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@ToString(exclude = "cardGame")
public class Format {
    @ManyToOne
    @JsonBackReference
    private CardGame cardGame;
    @OneToMany(mappedBy = "format")
    private List<Tournament> tournaments;
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

