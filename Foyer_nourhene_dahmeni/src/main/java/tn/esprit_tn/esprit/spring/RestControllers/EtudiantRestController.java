package tn.esprit_tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit_tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit_tn.esprit.spring.Services.Etudiant.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    IEtudiantService iEtudiantService;

    // post (ajout) , put (modif) , get (récup) , delete ( supprimé
    @GetMapping("getAllEtudiants")
    public List <Etudiant> getAll(){
        return  iEtudiantService.findAllEtudiants();
    }

    //http://localhost:8080/getById?id=1
    @GetMapping("getById")
    public  Etudiant getById (@RequestParam long id ){
        return iEtudiantService.findEtudiantById(id);
    }
    //http://localhost:8080/getById2/1
    @GetMapping("getById2/{id}")
    public Etudiant getById2 (@PathVariable long id){
        return iEtudiantService.findEtudiantById(id);
    }
    //int , float , string , @PathVariable ou @RequestParam
    // objet ou list @ResquestParam
    @PostMapping("addEtudiant")
    public Etudiant addEtudiant (@RequestBody Etudiant b){
        return iEtudiantService.addEtudiant(b);
    }

    @PostMapping("addAllEtudiants")
    public List <Etudiant> addAllEtudiants(@RequestBody List<Etudiant> blocs){
        return iEtudiantService.addAllEtudiants(blocs);
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiantById(@PathVariable int id) {
        iEtudiantService.deleteEtudiantById(id);
    }


}
