package tn.esprit_tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit_tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit_tn.esprit.spring.Services.Foyer.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")

public class FoyerRestController {
    IFoyerService iFoyerService;

    // post (ajout) , put (modif) , get (récup) , delete ( supprimé
    @GetMapping("getAllFoyers")
    public List <Foyer> getAll(){
        return  iFoyerService.findAllFoyers();
    }

    //http://localhost:8080/getById?id=1
    @GetMapping("getById")
    public  Foyer getById (@RequestParam long id ){
        return iFoyerService.findFoyerById(id);
    }
    //http://localhost:8080/getById2/1
    @GetMapping("getById2/{id}")
    public Foyer getById2 (@PathVariable long id){
        return iFoyerService.findFoyerById(id);
    }
    //int , float , string , @PathVariable ou @RequestParam
    // objet ou list @ResquestParam
    @PostMapping("addFoyer")
    public Foyer addFoyer (@RequestBody Foyer b){
        return iFoyerService.addFoyer(b);
    }

    @PostMapping("addAllFoyers")
    public List <Foyer> addAllFoyers(@RequestBody List<Foyer> blocs){
        return iFoyerService.addAllFoyers(blocs);
    }

    @DeleteMapping("/{id}")
    public void deleteFoyerById(@PathVariable int id) {
        iFoyerService.deleteFoyerById(id);
    }


}
