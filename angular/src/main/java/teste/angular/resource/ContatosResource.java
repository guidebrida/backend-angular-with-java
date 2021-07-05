package teste.angular.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import teste.angular.domain.Contatos;
import teste.angular.service.ContatosService;

import java.net.URI;
import java.util.List;

@RequestMapping(value = "/contatos")
@RestController
public class ContatosResource {

    @Autowired
    private ContatosService contatosService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Contatos>> findAll(){
        List<Contatos> list = contatosService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Contatos> findOne(@PathVariable Integer id){
        Contatos obj = contatosService.findOne(id);
        return ResponseEntity.ok().body(obj);
    }

}
