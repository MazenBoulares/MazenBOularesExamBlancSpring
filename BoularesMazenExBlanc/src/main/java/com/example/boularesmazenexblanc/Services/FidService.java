package com.example.boularesmazenexblanc.Services;



import com.example.boularesmazenexblanc.DAO.Entities.CarteFid;
import com.example.boularesmazenexblanc.DAO.Entities.Client;
import com.example.boularesmazenexblanc.DAO.Repositories.ClientRepository;
import com.example.boularesmazenexblanc.DAO.Repositories.FidRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class FidService implements iFidService{


    FidRepository fidRepository;





    @Override
    public Long effectuerOperation(String typeOperation, long numCarte, int montant) {
        CarteFid carte = fidRepository.findByNumeroCarte(numCarte);


        carte.setSolde(carte.getSolde() + montant);

        fidRepository.save(carte);
        return null;
    }






}
