package com.spring_key.gestionetornei.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Tournament {
    private String prize;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime date;
    private String name;
    private int capacity;
    @ManyToOne
    private Format format;





}
