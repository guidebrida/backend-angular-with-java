package teste.angular.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import teste.angular.domain.enums.Contatos;
import teste.angular.service.ContatosService;

import java.net.URI;
import java.util.List;

@RequestMapping(value = "/contatos")
@RestController
public class ContatosResource {

    @Autowired
    private ContatosService contatosService;

    @GetMapping
    public ResponseEntity<List<Contatos>> findAll(){
        List<Contatos> list = contatosService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Contatos> findOne(@PathVariable Integer id){
        Contatos obj = contatosService.findOne(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody Contatos obj){
        obj = contatosService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        contatosService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
