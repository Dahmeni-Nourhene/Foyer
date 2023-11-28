package tn.esprit_tn.esprit.spring.Services.Foyer;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit_tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit_tn.esprit.spring.DAO.Repositories.FoyerRepository;

import java.util.List;
import java.util.Optional;

@Service // definir cest un bean Spring
@AllArgsConstructor // on va utiliser methode constructeur au lieu de @autowired ou @inject
public class FoyerService implements IFoyerService{
    FoyerRepository foyerRepository;



    @Override
    public Foyer addFoyer(Foyer b) {
        return foyerRepository.save(b);
    }

    @Override
    public List<Foyer> addAllFoyers(List<Foyer> foyers){
        return foyerRepository.saveAll(foyers);
    }
    @Override
    public Foyer updateFoyer(Foyer b){
        return foyerRepository.save(b);
    }
    @Override
    public  List<Foyer> updateAllFoyers(List<Foyer> foyers){
        return foyerRepository.saveAll(foyers);
    }
    @Override
    public List<Foyer> findAllFoyers() {
        return foyerRepository.findAll();
    }
    @Override
    public Foyer findFoyerById(long id){
        return foyerRepository.findById(id).orElse(Foyer.builder().idFoyer(0).nomFoyer("Foyer bizarre").build());

    }
    @Override
    public boolean existById(long id){
        return foyerRepository.findById(id).isPresent();
    }

    @Override
    public void deleteFoyer(Foyer b){
        foyerRepository.delete(b);

    }
    @Override
    public void deleteFoyerById(long id) {

        foyerRepository.deleteById((long) id);
    }

}
