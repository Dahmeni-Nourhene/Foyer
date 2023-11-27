package tn.esprit_tn.esprit.spring.Services.Reservation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit_tn.esprit.spring.DAO.Repositories.ReservationRepository;
@Service  // définir que c'est un bean spring
@AllArgsConstructor // pour injecter un bean dans un autre bean
public class ReservationService implements IReservationService{
    ReservationRepository reservationRepository;
}
