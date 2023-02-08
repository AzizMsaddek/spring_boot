package com.example.spring_boot.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMoniteur;
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecru;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> Cours;
}
