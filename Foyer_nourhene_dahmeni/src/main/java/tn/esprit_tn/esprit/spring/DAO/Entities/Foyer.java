package tn.esprit_tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiantFoyer")
    private long idFoyer;

    private String nomFoyer;
    private long capaciteFoyer;


    @OneToOne(mappedBy="foyer")
    private Universite universite;

    @OneToMany(mappedBy = "foyer")
    List<Bloc> blocs;

}
