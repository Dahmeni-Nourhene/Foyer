package tn.esprit_tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Chambre {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiantChambre")
    private long idChambre;
    private long numeroChambre;
    private TypeChambre typeC;

    @ManyToOne
    Bloc bloc;


    @OneToMany
    List<Reservation> reservations;

}