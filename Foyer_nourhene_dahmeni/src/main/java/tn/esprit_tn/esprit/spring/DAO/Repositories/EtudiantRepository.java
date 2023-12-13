package tn.esprit_tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit_tn.esprit.spring.DAO.Entities.Etudiant;

import java.util.Date;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    //select * from Etudiant where cin=...
    Etudiant findByCin(long cin);

    Etudiant findByNomEtAndPrenom(String nomEt,String prenomEt);
    //select * from Etudiant where nomEt like ...
    List<Etudiant> findByNomEtLike(String nom);
    List<Etudiant> findByNomEtContains(String nom);
    List<Etudiant> findByNomEtContaining(String nom);

    List<Etudiant> findByDateNaissanceAfter(Date dateNaissance);

    List<Etudiant> findByEcole(String ecole);

    List<Etudiant> findByReservationOrderByReservations(int idReservation);




}