package tn.esprit_tn.esprit.spring.Services.Bloc;

import tn.esprit_tn.esprit.spring.DAO.Entities.Bloc;

import java.util.List;
import java.util.Optional;

public interface IBlocService {
    List<Bloc> getBlocsList();

    public Optional<Bloc> getBlocById(int id);
    public Bloc createBloc(Bloc bloc);
    public void deleteBloc(int id);
}
