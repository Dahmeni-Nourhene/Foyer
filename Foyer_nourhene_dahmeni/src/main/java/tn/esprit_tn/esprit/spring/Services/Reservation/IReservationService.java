package tn.esprit_tn.esprit.spring.Services.Reservation;

import tn.esprit_tn.esprit.spring.DAO.Entities.Reservation;

import java.util.List;
import java.util.Optional;

public interface IReservationService {

    List<Reservation> findAllReservations();

    Reservation addReservation(Reservation b);

    Reservation findReservationById(long idReservation);

    Reservation updateReservation(Reservation b);

    List<Reservation> updateAllReservations(List<Reservation> blocs);

    boolean existById(long id);

    void deleteReservation(Reservation b);

    void deleteReservationById(long id);

    List<Reservation> addAllReservations(List<Reservation> blocs);


}
