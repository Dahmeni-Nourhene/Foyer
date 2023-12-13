package tn.esprit_tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit_tn.esprit.spring.DAO.Entities.Universite;

import java.util.Date;
import java.util.List;

public interface UniversiteRepository  extends JpaRepository<Universite, Long> {

    List<Universite> findByFoyerBlocsChambresReservationsEtudiantsNomEtAndDateNaissanceBetween(String nomEt, Date datemin, Date datemax);
}