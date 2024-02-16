package com.example.boularesmazenexblanc.DAO.Scheduler;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class Schedular {

        @Scheduled(fixedRate = 2000)
    void totalSolde(){

            System.out.println("Bonjour");
    }


}