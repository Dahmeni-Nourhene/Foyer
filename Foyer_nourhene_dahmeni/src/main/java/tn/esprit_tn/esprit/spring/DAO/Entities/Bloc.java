package tn.esprit_tn.esprit.spring.DAO.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id de chaque entité génére automatiquement - auto incrément
    private long idBloc;
    private String nomBloc;
    private long capacitéBloc;
}
