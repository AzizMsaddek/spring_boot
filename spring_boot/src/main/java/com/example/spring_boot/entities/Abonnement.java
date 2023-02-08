package com.example.spring_boot.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAbon;
    private Long numAbon;
    private Date dateDebut;
    private Date dateFin;
    private Float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;


}
