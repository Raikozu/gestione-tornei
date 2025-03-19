package com.spring_key.gestionetornei.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class TournamentUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private CardGameUser user;
    @ManyToOne
    private Tournament tournament;

    private int position;

}
