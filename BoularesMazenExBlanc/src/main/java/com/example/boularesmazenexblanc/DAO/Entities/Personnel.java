package com.example.boularesmazenexblanc.DAO.Entities;

import com.example.boularesmazenexblanc.DAO.Entities.Types.TypePersonnel;
import jakarta.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import lombok.*;

import lombok.Data;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="Personnel")
public class Personnel {

    @Id
    @Column(name="idPersonnel")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idPersonnel;

    private String nomPersonelle;


    private String prenomPersonelle;


    private LocalDate dateNaissanceP;

    private TypePersonnel typePersonnel;


    //parent
    //works in
    @OneToOne(mappedBy = "employee")
    private Magasin Employer;





//parent
    //caissier
    @ManyToOne
    private Magasin caisse;




}