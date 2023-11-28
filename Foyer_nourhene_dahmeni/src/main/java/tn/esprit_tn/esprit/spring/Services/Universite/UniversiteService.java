package tn.esprit_tn.esprit.spring.Services.Universite;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit_tn.esprit.spring.DAO.Entities.Universite;
import tn.esprit_tn.esprit.spring.DAO.Repositories.UniversiteRepository;

import java.util.List;
import java.util.Optional;

@Service // definir cest un bean Spring
@AllArgsConstructor // on va utiliser methode constructeur au lieu de @autowired ou @inject
public class UniversiteService implements IUniversiteService{
    UniversiteRepository universiteRepository;



    @Override
    public Universite addUniversite(Universite b) {
        return universiteRepository.save(b);
    }

    @Override
    public List<Universite> addAllUniversites(List<Universite> universites){
        return universiteRepository.saveAll(universites);
    }
    @Override
    public Universite updateUniversite(Universite b){
        return universiteRepository.save(b);
    }
    @Override
    public  List<Universite> updateAllUniversites(List<Universite> universites){
        return universiteRepository.saveAll(universites);
    }
    @Override
    public List<Universite> findAllUniversites() {
        return universiteRepository.findAll();
    }
    @Override
    public Universite findUniversiteById(long id){
        return universiteRepository.findById(id).orElse(Universite.builder().idUniversite(0).nomUniversite("Universite bizarre").build());

    }
    @Override
    public boolean existById(long id){
        return universiteRepository.findById(id).isPresent();
    }

    @Override
    public void deleteUniversite(Universite b){
        universiteRepository.delete(b);

    }
    @Override
    public void deleteUniversiteById(long id) {

        universiteRepository.deleteById((long) id);
    }

}
