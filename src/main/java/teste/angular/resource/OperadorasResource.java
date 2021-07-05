package teste.angular.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teste.angular.domain.Operadoras;
import teste.angular.service.OperadorasService;


import java.util.List;

@RequestMapping(value = "/operadoras")
@RestController
public class OperadorasResource {


    @Autowired
    private OperadorasService operadorasService;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Operadoras>> findAll(){
        List<Operadoras> list = operadorasService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Operadoras> find(@PathVariable Integer id){
        Operadoras obj = operadorasService.find(id);
        return ResponseEntity.ok().body(obj);
    }

}
