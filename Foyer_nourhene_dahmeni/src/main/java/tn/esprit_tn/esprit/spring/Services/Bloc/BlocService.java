package tn.esprit_tn.esprit.spring.Services.Bloc;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit_tn.esprit.spring.DAO.Repositories.BlocRepository;

@Service  // définir que c'est un bean spring
@AllArgsConstructor // pour injecter un bean dans un autre bean
public class BlocService implements IBlocService {
    BlocRepository blocRepository ;
}
