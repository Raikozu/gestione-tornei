package com.spring_key.gestionetornei.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Column(name = "name",unique = true)
    private String name;
    private String place;
  /*  @OneToMany(mappedBy = "business")
    private List<CardGame> cardGames;*/

    public void setName(String name){
        this.name = name;
    }

}
