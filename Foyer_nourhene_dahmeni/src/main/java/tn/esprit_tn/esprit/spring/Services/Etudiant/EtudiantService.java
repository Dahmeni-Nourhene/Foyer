package tn.esprit_tn.esprit.spring.Services.Etudiant;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit_tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit_tn.esprit.spring.DAO.Repositories.EtudiantRepository;

import java.util.List;

@Service // definir cest un bean Spring
@AllArgsConstructor // on va utiliser methode constructeur au lieu de @autowired ou @inject
public class EtudiantService implements IEtudiantService {
    EtudiantRepository etudiantRepository;



    @Override
    public Etudiant addEtudiant(Etudiant b) {
        return etudiantRepository.save(b);
    }

    @Override
    public List<Etudiant> addAllEtudiants(List<Etudiant> blocs){
        return etudiantRepository.saveAll(blocs);
    }
    @Override
    public Etudiant updateEtudiant(Etudiant b){
        return etudiantRepository.save(b);
    }
    @Override
    public  List<Etudiant> updateAllEtudiants(List<Etudiant> blocs){
        return etudiantRepository.saveAll(blocs);
    }
    @Override
    public List<Etudiant> findAllEtudiants() {
        return etudiantRepository.findAll();
    }
    @Override
    public Etudiant findEtudiantById(long id){
        return etudiantRepository.findById(id).orElse(Etudiant.builder().id(0).nomEt("Etudiant bizarre").build());

    }
    @Override
    public boolean existById(long id){
        return etudiantRepository.findById(id).isPresent();
    }

    @Override
    public void deleteEtudiant(Etudiant b){
        etudiantRepository.delete(b);

    }
    @Override
    public void deleteEtudiantById(long id) {

        etudiantRepository.deleteById((long) id);
    }

}
