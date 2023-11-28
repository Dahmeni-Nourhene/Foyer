package tn.esprit_tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit_tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit_tn.esprit.spring.DAO.Entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, String> {

}
