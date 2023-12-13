package tn.esprit_tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit_tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit_tn.esprit.spring.DAO.Entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {

    Chambre findChambreByNumeroChambre(int numChambre);
    Chambre findChambreByTypeC(TypeChambre typeC);
    Chambre findChambreByNomBloc(String nomBloc);
    Chambre findChambreByBlocNomTAndTypeC(String nomBloc, TypeChambre typeC);
    Chambre findChambreByNumeroChambreAAndTypeC(int numeroChambre,TypeChambre typeChambre);
    List<Chambre> findChambreByNomUn();
}