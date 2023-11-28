package tn.esprit_tn.esprit.spring.Services.Universite;

import tn.esprit_tn.esprit.spring.DAO.Entities.Universite;

import java.util.List;
import java.util.Optional;

public interface IUniversiteService {

    List<Universite> findAllUniversites();

    Universite addUniversite(Universite b);

    Universite findUniversiteById(long idUniversite);

    Universite updateUniversite(Universite b);

    List<Universite> updateAllUniversites(List<Universite> blocs);

    boolean existById(long id);

    void deleteUniversite(Universite b);

    void deleteUniversiteById(long id);

    List<Universite> addAllUniversites(List<Universite> blocs);
}
