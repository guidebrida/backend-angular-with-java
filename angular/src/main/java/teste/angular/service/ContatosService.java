package teste.angular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teste.angular.domain.enums.Contatos;
import teste.angular.repositories.ContatosRepository;
import teste.angular.service.exception.ObjectNotFoundException;

import java.util.List;

@Service
public class ContatosService {

    @Autowired
    private ContatosRepository contatosRepository;

    public List<Contatos> findAll(){
        return contatosRepository.findAll();
    }

    public Contatos findOne(Integer id){
        return contatosRepository.findById(id).orElseThrow(()-> new ObjectNotFoundException("Não encontrado"));
    }

    public Contatos insert(Contatos obj){
        return contatosRepository.save(obj);
    }

    public void delete(Integer id){
        contatosRepository.deleteById(id);
    }
}
