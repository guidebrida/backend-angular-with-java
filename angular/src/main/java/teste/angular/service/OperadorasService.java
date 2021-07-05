package teste.angular.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teste.angular.domain.Contatos;
import teste.angular.repositories.OperadorasRepository;
import teste.angular.service.exception.ObjectNotFoundException;

import java.util.List;

@Service
public class OperadorasService {

    @Autowired
    OperadorasRepository operadorasRepository;

    public List<Contatos> findAll(){
        return operadorasRepository.findAll();
    }

    public Contatos findOne(Integer id){
        return operadorasRepository.findById(id).orElseThrow(()-> new ObjectNotFoundException("Não encontrado"));
    }

    public Contatos insert(Contatos obj){
        return operadorasRepository.save(obj);
    }

    public void delete(Integer id){
        operadorasRepository.deleteById(id);
    }

}
}
