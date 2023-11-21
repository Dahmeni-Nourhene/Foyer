package tn.esprit_tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit_tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit_tn.esprit.spring.DAO.Entities.Foyer;

public interface FoyerRepository  extends JpaRepository<Foyer, Long> {
}
