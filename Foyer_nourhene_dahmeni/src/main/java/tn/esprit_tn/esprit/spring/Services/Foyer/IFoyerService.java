package tn.esprit_tn.esprit.spring.Services.Foyer;

import tn.esprit_tn.esprit.spring.DAO.Entities.Foyer;

import java.util.List;
import java.util.Optional;

public interface IFoyerService {

    List<Foyer> findAllFoyers();

    Foyer addFoyer(Foyer b);

    Foyer findFoyerById(long idFoyer);

    Foyer updateFoyer(Foyer b);

    List<Foyer> updateAllFoyers(List<Foyer> blocs);

    boolean existById(long id);

    void deleteFoyer(Foyer b);

    void deleteFoyerById(long id);

    List<Foyer> addAllFoyers(List<Foyer> blocs);
}
