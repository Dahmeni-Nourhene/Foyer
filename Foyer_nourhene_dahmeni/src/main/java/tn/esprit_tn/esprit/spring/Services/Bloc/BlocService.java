package tn.esprit_tn.esprit.spring.Services.Bloc;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit_tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit_tn.esprit.spring.DAO.Repositories.BlocRepository;

import java.util.List;
import java.util.Optional;

@Service // definir cest un bean Spring
@AllArgsConstructor // on va utiliser methode constructeur au lieu de @autowired ou @inject
public class BlocService implements IBlocService{
BlocRepository blocRepository;

    @Override
    public List<Bloc> getBlocsList() {
        return blocRepository.findAll();
    }

    @Override
    public Optional<Bloc> getBlocById(int id) {
        return blocRepository.findById((long) id);
    }

    @Override
    public Bloc createBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(int id) {
        blocRepository.deleteById((long) id);
    }





}
