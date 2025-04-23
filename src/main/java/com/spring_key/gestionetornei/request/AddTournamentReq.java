package com.spring_key.gestionetornei.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AddTournamentReq {

    private String name;
    private String prize;
    private int capacity;
    private LocalDateTime date;
    private String formatName;  // Nome del formato per il torneo
}
