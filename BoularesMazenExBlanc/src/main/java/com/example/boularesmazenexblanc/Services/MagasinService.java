package com.example.boularesmazenexblanc.Services;



import com.example.boularesmazenexblanc.DAO.Entities.Client;
import com.example.boularesmazenexblanc.DAO.Entities.Magasin;
import com.example.boularesmazenexblanc.DAO.Repositories.ClientRepository;
import com.example.boularesmazenexblanc.DAO.Repositories.MagasinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class MagasinService implements IMagasinService {


    MagasinRepository MagasinRepository;

    ClientRepository clientRepository;


    @Override
    public Magasin affecterClientAMagasin(Client client, long idMagasin) {

        Optional<Magasin> m = MagasinRepository.findById(idMagasin);



      clientRepository.save(client);

      List<Client> list= m.get().getClients();

      list.add(client);

      m.get().setClients(list);

        return MagasinRepository.save(m.get());



    }

    ;


    @Override
    public Magasin addMagasin(Magasin b) {
        return MagasinRepository.save(b);
    }

    @Override
    public List<Magasin> addAllMagasins(List<Magasin> Magasins) {
        return MagasinRepository.saveAll(Magasins);
    }

    @Override
    public Magasin updateMagasin(Magasin b) {
        return MagasinRepository.save(b);
    }

    @Override
    public List<Magasin> findAllMagasins() {


        return MagasinRepository.findAll();
    }

    @Override
    public Optional<Magasin> findMagasinById(long id) {
        return MagasinRepository.findById(id);
    }

    @Override
    public void deleteMagasin(Magasin b) {
        MagasinRepository.delete(b);

    }

    @Override
    public void deleteMagasinById(long id) {
        MagasinRepository.deleteById(id);

    }


}
