package tn.esprit_tn.esprit.spring.Services.Chambre;

import tn.esprit_tn.esprit.spring.DAO.Entities.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> findAllChambres();

    Chambre addChambre(Chambre b);

    Chambre findChambreById(long idChambre);

    Chambre updateChambre(Chambre b);

    List<Chambre> updateAllChambres(List<Chambre> Chambres);

    boolean existById(long id);

    void deleteChambre(Chambre b);

    void deleteChambreById(long id);

    List<Chambre> addAllChambres(List<Chambre> Chambres);
}
