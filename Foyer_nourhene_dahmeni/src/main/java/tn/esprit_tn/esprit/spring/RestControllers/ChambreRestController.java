package tn.esprit_tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit_tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit_tn.esprit.spring.Services.Chambre.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambres")
public class ChambreRestController {
    IChambreService iChambreService;

    @GetMapping("getAllChambres")
    public List<Chambre> getAll() {
        return iChambreService.findAllChambres();
    }

    @GetMapping("getChambreById")
    public Chambre getById(@RequestParam long id) {
        return iChambreService.findChambreById(id);
    }

    // Modification du chemin d'API pour éviter le conflit
    @GetMapping("getChambreById2/{id}")
    public Chambre getById2(@PathVariable long id) {
        return iChambreService.findChambreById(id);
    }

    @PostMapping("addChambre")
    public Chambre addChambre(@RequestBody Chambre b) {
        return iChambreService.addChambre(b);
    }

    @PostMapping("addAllChambres")
    public List<Chambre> addAllChambres(@RequestBody List<Chambre> chambres) {
        return iChambreService.addAllChambres(chambres);
    }

    @DeleteMapping("/deleteChambre/{id}")
    public void deleteChambreById(@PathVariable int id) {
        iChambreService.deleteChambreById(id);
    }
}
