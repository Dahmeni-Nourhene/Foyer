package tn.esprit_tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit_tn.esprit.spring.DAO.Entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
