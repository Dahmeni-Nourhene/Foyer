package tn.esprit_tn.esprit.spring.Services.Chambre;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit_tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit_tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit_tn.esprit.spring.DAO.Repositories.ChambreRepository;

import java.util.List;

import static tn.esprit_tn.esprit.spring.DAO.Entities.TypeChambre.Simple;

@Service  // définir que c'est un bean spring
@AllArgsConstructor // pour injecter un bean dans un autre bean
public class ChambreService implements  IChambreService{
    ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre b) {
        return chambreRepository.save(b);
    }

    @Override
    public List<Chambre> addAllChambres(List<Chambre> Chambres){
        return chambreRepository.saveAll(Chambres);
    }
    @Override
    public Chambre updateChambre(Chambre b){
        return chambreRepository.save(b);
    }
    @Override
    public  List<Chambre> updateAllChambres(List<Chambre> Chambres){
        return chambreRepository.saveAll(Chambres);
    }
    @Override
    public List<Chambre> findAllChambres() {
        return chambreRepository.findAll();
    }
    @Override
    public Chambre findChambreById(long id){
        return chambreRepository.findById(id).orElse(Chambre.builder().idChambre(0).typeC(Simple).build());

    }
    @Override
    public boolean existById(long id){
        return chambreRepository.findById(id).isPresent();
    }

    @Override
    public void deleteChambre(Chambre b){
        chambreRepository.delete(b);

    }
    @Override
    public void deleteChambreById(long id) {

        chambreRepository.deleteById((long) id);
    }

}
