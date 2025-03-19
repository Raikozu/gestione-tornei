package com.spring_key.gestionetornei.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class CardGame {
    @ManyToOne
    private Business business;
    @Id
    private String name;
    @OneToMany(mappedBy ="cardGame")
    private List<Format> formats;

}
