package com.example.spring_boot.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Inscription implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idInscription;
    private Long numInscription;
    private Integer numSemaine;
    @ManyToOne
    Skieur skieur;
    @ManyToOne
    Cours cours;
}
