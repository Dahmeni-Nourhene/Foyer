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
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiantBloc")
    private long idBloc;

    private String nomBloc;

    private long capaciteBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    List<Chambre> chambres;
}
