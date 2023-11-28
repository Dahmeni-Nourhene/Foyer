package tn.esprit_tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit_tn.esprit.spring.DAO.Entities.Universite;
import tn.esprit_tn.esprit.spring.Services.Universite.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")

public class UniversiteRestController {
    IUniversiteService iUniversiteService;

    // post (ajout) , put (modif) , get (récup) , delete ( supprimé
    @GetMapping("getAllUniversites")
    public List <Universite> getAll(){
        return  iUniversiteService.findAllUniversites();
    }

    //http://localhost:8080/getById?id=1
    @GetMapping("getById")
    public  Universite getById (@RequestParam long id ){
        return iUniversiteService.findUniversiteById(id);
    }
    //http://localhost:8080/getById2/1
    @GetMapping("getById2/{id}")
    public Universite getById2 (@PathVariable long id){
        return iUniversiteService.findUniversiteById(id);
    }
    //int , float , string , @PathVariable ou @RequestParam
    // objet ou list @ResquestParam
    @PostMapping("addUniversite")
    public Universite addUniversite (@RequestBody Universite b){
        return iUniversiteService.addUniversite(b);
    }

    @PostMapping("addAllUniversites")
    public List <Universite> addAllUniversites(@RequestBody List<Universite> blocs){
        return iUniversiteService.addAllUniversites(blocs);
    }

    @DeleteMapping("/{id}")
    public void deleteUniversiteById(@PathVariable int id) {
        iUniversiteService.deleteUniversiteById(id);
    }


}
