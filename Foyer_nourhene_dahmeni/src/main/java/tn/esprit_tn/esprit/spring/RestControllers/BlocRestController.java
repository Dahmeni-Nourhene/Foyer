package tn.esprit_tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit_tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit_tn.esprit.spring.Services.Bloc.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/blocs")
public class BlocRestController {
    IBlocService iBlocService;

    // post (ajout) , put (modif) , get (récup) , delete ( supprimé
    @GetMapping("getAllBlocs")
    public List <Bloc> getAll(){
        return  iBlocService.findAllBlocs();
    }

    //http://localhost:8080/getById?id=1
    @GetMapping("getById")
    public  Bloc getById (@RequestParam long id ){
        return iBlocService.findBlocById(id);
    }
    //http://localhost:8080/getById2/1
    @GetMapping("getById2/{id}")
    public Bloc getById2 (@PathVariable long id){
        return iBlocService.findBlocById(id);
    }
    //int , float , string , @PathVariable ou @RequestParam
    // objet ou list @ResquestParam
    @PostMapping("addBloc")
    public Bloc addBloc (@RequestBody Bloc b){
        return iBlocService.addBloc(b);
    }

    @PostMapping("addAllBlocs")
    public List <Bloc> addAllBlocs(@RequestBody List<Bloc> blocs){
        return iBlocService.addAllBlocs(blocs);
    }

    @DeleteMapping("/{id}")
    public void deleteBlocById(@PathVariable int id) {
        iBlocService.deleteBlocById(id);
    }
    @PutMapping("updateBloc")
    public  Bloc updateBloc(@RequestBody Bloc b ){
        return iBlocService.updateBloc(b);
    }
    @PutMapping("updateAllBloc")
    public List<Bloc>  updateAllBloc(@RequestBody List<Bloc> blocs ){
        return iBlocService.addAllBlocs(blocs);
    }
}
