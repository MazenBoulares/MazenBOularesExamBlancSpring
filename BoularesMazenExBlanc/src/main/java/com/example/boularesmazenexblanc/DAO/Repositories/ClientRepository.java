package com.example.boularesmazenexblanc.DAO.Repositories;

import com.example.boularesmazenexblanc.DAO.Entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {


//    @Query("select b from Bloc b where b.nomBloc=?1")
//    Bloc selectByNomJPQL(String nom);
//
//
//    @Query(value="SELECT * FROM Bloc where nom_bloc:=nom",nativeQuery=true)
//    Bloc selectByNomBSQLK(@Param("nom") String nom);
//
//
//    @Query(value="SELECT * FROM Bloc where nom_bloc:=nom",nativeQuery=true)
//    Bloc selectByNomBSQLK(@Param ("nom") String nom);

    // JPQL
//    @Query("select c from Client c where c.identifiant=?1")
//    Client selectByIdentifiantJPQL(String identifiant);
//    //SQL
//    @Query(value = "select * from client where identifiant=?1",nativeQuery = true)
//    Client selectByIdentifiantSQL(String identifiant);


//    Bibliotheque findBibliothequeByNom(String nomBibilotheque);
//
//
//    Bibliotheque findBibliothequeByAdresseContaining(String adresse);
//
//    Bibliotheque findDistinctFirstByAdresse(String adress);


//    Bibliotheque findByAdresseOrderByNom();
//









//
//
//    Bloc findByNomBloc(String nomBloc);
//    Bloc getByNomBloc(String nomBloc);
//
//    Bloc findByNomBlocAndCapaciteBloc(String nomBloc,long capaciteBloc);
//    Bloc findByNomBlocOrCapaciteBloc(String nomBloc,long capaciteBloc);
//
//
////4- Recherche par nomBloc en ignorant la casse
//    Bloc findByNomBlocIgnoreCase(String nomBloc);
//
////5- Recherche par capaciteBloc supérieure à une valeur donnée
//    Bloc findByCapaciteBlocGreaterThan(Long capaciteBloc);
//
////6- Recherche par nomBloc contenant une sous-chaîne
//    List<Bloc> findByNomBlocContaining(String nomBloc);
//
////7- Tri par nomBloc par ordre alphabétique
//    List<Bloc>  findByOrderByNomBlocAsc();
//
//
//
//
//
//
////9- Recherche du bloc d'un foyer spécifique
//    Bloc findByFoyerId(Long foyerId);
//
//
//// 10- Recherche du bloc pour un foyer d'une université donnée
//
//    Bloc findByFoyerUniversityIdAndFoyerId(Long universityId, Long foyerId);
//



}
