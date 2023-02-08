package com.example.spring_boot.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPiste;
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private Integer longueur;
    private Integer pente;
    @ManyToMany(mappedBy="pistes", cascade = CascadeType.ALL)
    private Set<Skieur> skieurs;

}