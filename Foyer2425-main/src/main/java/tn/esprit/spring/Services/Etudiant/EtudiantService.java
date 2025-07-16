package tn.esprit.spring.Services.Etudiant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit.spring.DAO.Entities.Reservation;
import tn.esprit.spring.DAO.Repositories.EtudiantRepository;
import tn.esprit.spring.DAO.Repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService {
    EtudiantRepository repo;
    ReservationRepository reservationRepository;

    @Override
    public Etudiant addOrUpdate(Etudiant e) {
        return repo.save(e);
    }

    @Override
    public List<Etudiant> findAll() {
        return repo.findAll();
    }

    @Override
    public Etudiant findById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public void deleteById(long id) {
        repo.deleteById(id);
    }

    @Override
    public void delete(Etudiant e) {
        repo.delete(e);
    }

    @Override
    public List<Etudiant> selectJPQL(String nom) {
        return repo.selectJPQL(nom);
    }

    @Override
    public void affecterReservationAEtudiant
            (String idR, String nomE, String prenomE) {
        // ManyToMany: Reservation(Child) -- Etudiant(Parent)
        // 1- Récupérer les objets
        Reservation res= reservationRepository.findById(idR).get();
        Etudiant et= repo.getByNomEtAndPrenomEt(nomE,prenomE);
        // 2- Affectation: On affecte le child au parent
        et.getReservations().add(res);
        // 3- Save du parent
        repo.save(et);
    }
    @Override
    public void desaffecterReservationAEtudiant
            (String idR, String nomE, String prenomE) {
        // ManyToMany: Reservation(Child) -- Etudiant(Parent)
        // 1- Récupérer les objets
        Reservation res= reservationRepository.findById(idR).get();
        Etudiant et= repo.getByNomEtAndPrenomEt(nomE,prenomE);
        // 2- Affectation: On desaffecte le child au parent
        et.getReservations().remove(res);
        // 3- Save du parent
        repo.save(et);
    }
}
