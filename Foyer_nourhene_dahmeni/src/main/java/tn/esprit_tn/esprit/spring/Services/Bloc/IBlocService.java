package tn.esprit_tn.esprit.spring.Services.Bloc;

import tn.esprit_tn.esprit.spring.DAO.Entities.Bloc;

import java.util.List;
import java.util.Optional;

public interface IBlocService {

    List<Bloc> findAllBlocs();

    Bloc addBloc(Bloc b);

    Bloc findBlocById(long idBloc);

    Bloc updateBloc(Bloc b);

    List<Bloc> updateAllBlocs(List<Bloc> blocs);

    boolean existById(long id);

    void deleteBloc(Bloc b);

    void deleteBlocById(long id);

    List<Bloc> addAllBlocs(List<Bloc> blocs);
}
