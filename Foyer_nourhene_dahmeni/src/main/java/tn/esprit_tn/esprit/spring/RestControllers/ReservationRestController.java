package tn.esprit_tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit_tn.esprit.spring.DAO.Entities.Reservation;
import tn.esprit_tn.esprit.spring.Services.Reservation.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")

public class ReservationRestController {
    IReservationService iReservationService;

    // post (ajout) , put (modif) , get (récup) , delete ( supprimé
    @GetMapping("getAllReservations")
    public List <Reservation> getAll(){
        return  iReservationService.findAllReservations();
    }

    //http://localhost:8080/getById?id=1
    @GetMapping("getById")
    public  Reservation getById (@RequestParam long id ){
        return iReservationService.findReservationById(id);
    }
    //http://localhost:8080/getById2/1
    @GetMapping("getById2/{id}")
    public Reservation getById2 (@PathVariable long id){
        return iReservationService.findReservationById(id);
    }
    //int , float , string , @PathVariable ou @RequestParam
    // objet ou list @ResquestParam
    @PostMapping("addReservation")
    public Reservation addReservation (@RequestBody Reservation b){
        return iReservationService.addReservation(b);
    }

    @PostMapping("addAllReservations")
    public List <Reservation> addAllReservations(@RequestBody List<Reservation> blocs){
        return iReservationService.addAllReservations(blocs);
    }

    @DeleteMapping("/{id}")
    public void deleteReservationById(@PathVariable int id) {
        iReservationService.deleteReservationById(id);
    }


}
