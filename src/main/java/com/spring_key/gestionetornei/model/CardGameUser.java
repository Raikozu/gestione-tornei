package com.spring_key.gestionetornei.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class CardGameUser {
    @Id
    private String email;
    @ManyToOne
    private Business business;
    private String fullName;
}
