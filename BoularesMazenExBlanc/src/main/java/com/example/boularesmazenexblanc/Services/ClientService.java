package com.example.boularesmazenexblanc.Services;



import com.example.boularesmazenexblanc.DAO.Entities.Client;
import com.example.boularesmazenexblanc.DAO.Repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class ClientService implements IClientService {


    ClientRepository clientRepository;




    @Override
    public Client addClient(Client b) {
        return clientRepository.save(b);
    }

    @Override
    public List<Client> addAllClients(List<Client> Clients) {
        return clientRepository.saveAll(Clients);
    }

    @Override
    public Client updateClient(Client b) {
        return clientRepository.save(b);
    }

    @Override
    public List<Client> findAllClients() {



        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findClientById(long id) {
        return clientRepository.findById(id);
    }

    @Override
    public void deleteClient(Client b) {
        clientRepository.delete(b);

    }

    @Override
    public void deleteClientById(long id) {
        clientRepository.deleteById(id);

    }


}
