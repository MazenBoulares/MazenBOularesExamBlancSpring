package com.example.boularesmazenexblanc.Services;



import com.example.boularesmazenexblanc.DAO.Entities.Client;


import java.util.List;
import java.util.Optional;

public interface IClientService {




    Client addClient(Client b);



List<Client> addAllClients(List<Client> Clients);
   Client updateClient(Client b);
    List<Client> findAllClients();
    Optional<Client> findClientById(long id);
    void deleteClient(Client b);
    void deleteClientById(long id);









}
