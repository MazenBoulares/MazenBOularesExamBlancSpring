package com.example.boularesmazenexblanc.DAO.Entities;

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
@Table(name="Magasin")
public class Magasin {

    @Id
    @Column(name="idMagasin")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idMagasin;

    private String nomMagasin;

//    private TypeLivre type;


    private String adressMagasin;

    private long contactMagasin;


    private LocalDate dateReservation;


    @OneToOne
    private Personnel employee;


    @OneToMany(mappedBy = "caisse",cascade = CascadeType.ALL)
    private List<Personnel> caissiers;


@ManyToMany
    private List<Client> clients;




}