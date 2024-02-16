package com.example.boularesmazenexblanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="CarteFid")
public class CarteFid {

    @Id
    @Column(name="idCarte")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idCarte;

    private long numeroCarte;

    private long solde;

    private LocalDate dateCreation;






}