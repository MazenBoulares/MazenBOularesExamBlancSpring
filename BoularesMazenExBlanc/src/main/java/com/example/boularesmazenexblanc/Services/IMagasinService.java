package com.example.boularesmazenexblanc.Services;


import com.example.boularesmazenexblanc.DAO.Entities.Client;
import com.example.boularesmazenexblanc.DAO.Entities.Magasin;

import java.util.List;
import java.util.Optional;

public interface IMagasinService {




    Magasin addMagasin(Magasin b);

    Magasin affecterClientAMagasin(Client client, long idMagasin);


List<Magasin> addAllMagasins(List<Magasin> Magasins);
   Magasin updateMagasin(Magasin b);
    List<Magasin> findAllMagasins();
    Optional<Magasin> findMagasinById(long id);
    void deleteMagasin(Magasin b);
    void deleteMagasinById(long id);









}
