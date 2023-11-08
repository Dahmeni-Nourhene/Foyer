package tn.esprit_tn.esprit.spring.DAO.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Reservation {
    @Id
    private String idReservation;
    private LocalDate dateNaissance;
    private boolean estValide;
}
