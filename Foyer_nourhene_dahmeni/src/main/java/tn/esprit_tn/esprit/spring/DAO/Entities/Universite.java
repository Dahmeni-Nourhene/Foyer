package tn.esprit_tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiantUniversite")
    private long idUniversite;

    private String nomUniversite;
    private String adresse;

    @OneToOne
    private Foyer foyer;

}