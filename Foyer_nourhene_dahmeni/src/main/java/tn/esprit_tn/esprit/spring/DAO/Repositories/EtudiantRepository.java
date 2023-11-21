package tn.esprit_tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit_tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit_tn.esprit.spring.DAO.Entities.Foyer;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
