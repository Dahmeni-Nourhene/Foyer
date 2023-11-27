package tn.esprit_tn.esprit.spring.Services.Universite;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit_tn.esprit.spring.DAO.Repositories.UniversiteRepository;

@Service  // définir que c'est un bean spring
@AllArgsConstructor // pour injecter un bean dans un autre bean
public class UniversiteService implements IUniversiteService{
    UniversiteRepository universiteRepository;

}