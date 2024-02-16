package com.example.boularesmazenexblanc.RestControllers;

import com.example.boularesmazenexblanc.DAO.Entities.Client;
import com.example.boularesmazenexblanc.DAO.Entities.Magasin;
import com.example.boularesmazenexblanc.Services.ClientService;
import com.example.boularesmazenexblanc.Services.IClientService;

import com.example.boularesmazenexblanc.Services.IMagasinService;
import com.example.boularesmazenexblanc.Services.iFidService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("rest")
@AllArgsConstructor
public class RestController {


    IClientService clientService;



    IMagasinService magasinService;

    iFidService fidService;



    @PostMapping()
    Client ajouterClient(@RequestBody Client client){
        return clientService.addClient(client);
    };


    @PostMapping("ajoutMagasinPers")
    Magasin ajouterMagasinEtPersonnel(@RequestBody Magasin magasin){
        return magasinService.addMagasin(magasin);
    };




    @PostMapping("affecterClientMagasin")
    Magasin affecterClientAMagasin(@RequestBody Client client, @RequestParam long idMagasin){
        return magasinService.affecterClientAMagasin(client,idMagasin);
    };


    @PostMapping("2")
Long effectuerOperation(@RequestParam String typeOperation, @RequestParam long numCarte,@RequestParam int montant){
        return fidService.effectuerOperation(typeOperation,numCarte,montant);
    }






}
