package tn.esprit_tn.esprit.spring.Services.Chambre;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit_tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit_tn.esprit.spring.DAO.Repositories.ChambreRepository;

import java.util.List;

@Service  // définir que c'est un bean spring
@AllArgsConstructor // pour injecter un bean dans un autre bean
public class ChambreService implements  IChambreService{
    ChambreRepository chambreRepository;
    public List<Chambre> getChambresList() {
        return null;
    }
}
