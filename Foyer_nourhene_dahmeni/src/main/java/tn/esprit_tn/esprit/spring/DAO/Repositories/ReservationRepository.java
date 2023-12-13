package tn.esprit_tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit_tn.esprit.spring.DAO.Entities.Reservation;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, String> {

    List<Reservation> findReservationByEstValide();
    List<Reservation> findReservationByEtudiantsid();

    List<Reservation> findReservationByEstValideAndAnneUniversitaire();

}