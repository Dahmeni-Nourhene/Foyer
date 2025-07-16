package tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.DAO.Entities.TypeChambre;

import java.time.LocalDate;
import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    Chambre findByNumeroChambre(long num);


    int countByTypeCAndBlocIdBloc(TypeChambre typeChambre, long idBloc);

    //********************* Ajouter Reservation *********************
    //SQL
    @Query(value = "select count(*) from t_chambre c " +
            "join t_chambre_reservations cr on c.id_chambre=cr.chambre_id_chambre " +
            "join t_reservation r on cr.reservations_id_reservation=r.id_reservation " +
            "where c.id_chambre=?1 and r.annee_universitaire between ?2 and ?3", nativeQuery = true)
    int listerReservationPourUneChambre(long idChambre, LocalDate dateDebutAU, LocalDate dateFinAU);

    //Keyword
    int countReservationsByIdChambreAndReservationsAnneeUniversitaireBetween(long chambreId, LocalDate dateDebutAU, LocalDate dateFinAU);

    //*****************************************************************
    Chambre findByReservationsIdReservation(String idReservation);

    long count();

    long countChambreByTypeC(TypeChambre typeChambre);

    long countReservationsByIdChambreAndReservationsEstValideAndReservationsAnneeUniversitaireBetween(long idChambre, boolean estValide, LocalDate dateDebut, LocalDate dateFin);
//    List<Chambre> findAllByNumeroChambre(List<Long> num);

    List<Chambre> findByBlocNomBloc(String nomB);

    @Query("select c from Chambre c where c.bloc.nomBloc=?1")
    List<Chambre> getChambresParNomBlocJPQL(String nomBloc);

    @Query(value = "SELECT c.* FROM t_chambre c JOIN t_bloc b " +
            "ON c.bloc_id_bloc=b.id_bloc WHERE b.nom_bloc=:nom"
            , nativeQuery = true)
    List<Chambre> getChambresParNomBlocSQL(@Param(value = "nom") String nomBloc);


    @Query("select count(c) from Chambre c where c.typeC=?1 and c.bloc.idBloc=?2")
    long select(TypeChambre typeChambre, long idBloc);

    @Query(value = "select count(c) from t_chambre c join t_bloc b " +
            "on b.id_bloc=c.bloc_id_bloc  where c.type_c=?1 and b.id_bloc=?2"
            , nativeQuery = true)
    long selectSQL(TypeChambre typeChambre, long idBloc);


}
