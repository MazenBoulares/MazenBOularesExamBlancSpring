package com.example.boularesmazenexblanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="Client")
public class Client {

    @Id
    @Column(name="idClient")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idMagasin;

    private String nomClient;

    private String prenomClient;

    private String adressClient;

    private long cin;

//parent
    @OneToOne
    private CarteFid carteFid;



  @ManyToMany(mappedBy = "clients")

    private List<Magasin> magasins;







}