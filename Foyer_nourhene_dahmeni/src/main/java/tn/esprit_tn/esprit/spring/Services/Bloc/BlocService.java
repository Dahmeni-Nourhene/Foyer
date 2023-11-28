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
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> addAllBlocs(List<Bloc> blocs){
        return blocRepository.saveAll(blocs);
    }
    @Override
    public Bloc updateBloc(Bloc b){
        return blocRepository.save(b);
    }
    @Override
    public  List<Bloc> updateAllBlocs(List<Bloc> blocs){
        return blocRepository.saveAll(blocs);
    }
    @Override
    public List<Bloc> findAllBlocs() {
        return blocRepository.findAll();
    }
    @Override
    public Bloc findBlocById(long id){
        return blocRepository.findById(id).orElse(Bloc.builder().idBloc(0).nomBloc("Bloc bizarre").build());

    }
    @Override
    public boolean existById(long id){
        return blocRepository.findById(id).isPresent();
    }

   @Override
   public void deleteBloc(Bloc b){
        blocRepository.delete(b);

   }
    @Override
    public void deleteBlocById(long id) {

        blocRepository.deleteById((long) id);
    }

}
