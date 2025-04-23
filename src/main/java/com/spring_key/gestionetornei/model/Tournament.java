package com.spring_key.gestionetornei.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String prize;
    private int capacity;
    private LocalDateTime date;

    @ManyToOne(optional = false)
    @JsonIgnore
    @JoinColumn(nullable = false, name = "format_id")
    private Format format;
}
