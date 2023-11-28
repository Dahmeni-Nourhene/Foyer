package tn.esprit_tn.esprit.spring.Services.Reservation;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit_tn.esprit.spring.DAO.Entities.Reservation;
import tn.esprit_tn.esprit.spring.DAO.Repositories.ReservationRepository;

import java.util.List;

@Service // definir cest un bean Spring
@AllArgsConstructor // on va utiliser methode constructeur au lieu de @autowired ou @inject
public class ReservationService implements IReservationService{
    ReservationRepository reservationRepository;



    @Override
    public Reservation addReservation(Reservation b) {
        return reservationRepository.save(b);
    }

    @Override
    public List<Reservation> addAllReservations(List<Reservation> reservations){
        return reservationRepository.saveAll(reservations);
    }
    @Override
    public Reservation updateReservation(Reservation b){
        return reservationRepository.save(b);
    }
    @Override
    public  List<Reservation> updateAllReservations(List<Reservation> reservations){
        return reservationRepository.saveAll(reservations);
    }
    @Override
    public List<Reservation> findAllReservations() {
        return reservationRepository.findAll();
    }
    @Override
    public Reservation findReservationById(long id){
        return reservationRepository.findById(String.valueOf(id)).orElse(Reservation.builder().idReservation(0).build());

    }
    @Override
    public boolean existById(long id){
        return reservationRepository.findById(String.valueOf(id)).isPresent();
    }

    @Override
    public void deleteReservation(Reservation b){
        reservationRepository.delete(b);

    }



    @Override
    public void deleteReservationById(long id) {

        reservationRepository.deleteById(String.valueOf(id));
    }

}
