package tn.esprit_tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit_tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit_tn.esprit.spring.DAO.Entities.TypeChambre;

import java.util.List;

public interface FoyerRepository  extends JpaRepository<Foyer, Long> {
    Foyer findByNomfoyer(String nom );

    //select * from Foyer where capaciteFoyer >...
    List<Foyer> findFoyerByCapaciteGreaterThen(int capacite);
    //select * from Foyer where capaciteFoyer <...
    List<Foyer> findFoyerByCapaciterLessThen(int capacite);

    //select * from Foyer where capaciteFoyer >... and capaciteFoyer >...
    List<Foyer> findFoyerByCapaciteBetween(int capmin , int capmax);
    // Afficher le foyer de l'universite dont son nom est passé en paraametre
    // select f from Foyer f JOIN Universite u ON <Condition de Jointure> where <Condition>
    Foyer findByUniversiteNomUniversite(String nom);
    //Afficher la liste des foyers qui comportent des chambres de meme type
    //que le type passé en parametre
    List<Foyer> getByBlocsChambresTypeC(TypeChambre typeChambre);
}