package tn.esprit_tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;

@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id de chaque entité génére automatiquement - auto incrément
    private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING) // type varchar kn mezethech ray typr nte3ha number ye 0 ye 1
    private TypeChambre typeC;
}
