package tn.esprit_tn.esprit.spring.Services.Foyer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit_tn.esprit.spring.DAO.Repositories.FoyerRepository;

@Service  // définir que c'est un bean spring
@AllArgsConstructor // pour injecter un bean dans un autre bean
public class FoyerService implements IFoyerService{
    FoyerRepository foyerRepository;
}
