package tn.esprit.spring.Services.Etudiant;

import tn.esprit.spring.DAO.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addOrUpdate(Etudiant e);
    List<Etudiant> findAll();
    Etudiant findById(long id);
    void deleteById(long id);
    void delete(Etudiant e);
    List<Etudiant> selectJPQL(String nom);
    void affecterReservationAEtudiant(String idR,String nomE, String prenomE);
    void desaffecterReservationAEtudiant(String idR, String nomE, String prenomE);
}
