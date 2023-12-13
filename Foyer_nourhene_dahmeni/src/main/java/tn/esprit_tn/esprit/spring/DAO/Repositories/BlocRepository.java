package tn.esprit_tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit_tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit_tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit_tn.esprit.spring.DAO.Entities.Universite;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
//  /// keyword : select */ count
//   // select * from Bloc where nomBloc= ...
//    Bloc findByNomBloc (String nomBloc);
//     Bloc getByNomBloc  (String nomBloc);
//    // select * from Bloc where nomBloc= ... and capaciteBloc =....
//    Bloc findByNomBlocAndCapaciteBloc (String nomBloc , int capaciteBloc);
//    // select * from Bloc where nomBloc= ... or capaciteBloc =....
//    Bloc findByNomBlocOrCapaciteBloc (String nomBloc , int capaciteBloc);
/// 1. Recherche par nomBloc

  List<Bloc> findByNomBloc(String nomBloc);

// 2. Recherche par capaciteBloc

  List<Bloc> findByCapaciteBloc(int capaciteBloc);

// 3. Recherche par nomBloc et capaciteBloc

  List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc, int capaciteBloc);

// 4. Recherche par nomBloc en ignorant la casse

  List<Bloc> findByNomBlocIgnoreCase(String nomBloc);

// 5. Recherche par capaciteBloc supérieure à une valeur donnée

  List<Bloc> findByCapaciteBlocGreaterThan(int capaciteMin);

// 6. Recherche par nomBloc contenant une sous-chaîne

  List<Bloc> findByNomBlocContaining(String sousChaîne);

// 7. Tri par nomBloc par ordre alphabétique

  List<Bloc> findAllByNomBlocOrderByNomBlocAsc();

// 8. Recherche par nomBloc ou capaciteBloc

  List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc, int capaciteBloc);

// 9. Recherche du bloc d'un foyer spécifique

  Bloc findByFoyer(Foyer foyer);

// 10. Recherche du bloc pour un foyer d'une université donnée

  Bloc findByFoyerInAndUniversite(Foyer foyer, Universite universite);

}
