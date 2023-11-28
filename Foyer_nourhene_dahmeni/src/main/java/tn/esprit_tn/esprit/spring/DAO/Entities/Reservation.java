package tn.esprit_tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Reservation {


    @Id
    @Column(name = "identifiantReservation")
    private long idReservation;
    private Date anneUniversitaire;
    private Boolean estValide;



    @ManyToMany
    List<Etudiant> etudiants;

}