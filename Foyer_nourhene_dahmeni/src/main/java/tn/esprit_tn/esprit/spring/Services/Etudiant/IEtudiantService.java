package tn.esprit_tn.esprit.spring.Services.Etudiant;

import tn.esprit_tn.esprit.spring.DAO.Entities.Etudiant;

import java.util.List;
import java.util.Optional;

public interface IEtudiantService {

    List<Etudiant> findAllEtudiants();

    Etudiant addEtudiant(Etudiant b);

    Etudiant findEtudiantById(long idEtudiant);

    Etudiant updateEtudiant(Etudiant b);

    List<Etudiant> updateAllEtudiants(List<Etudiant> blocs);

    boolean existById(long id);

    void deleteEtudiant(Etudiant b);

    void deleteEtudiantById(long id);

    List<Etudiant> addAllEtudiants(List<Etudiant> blocs);
}
