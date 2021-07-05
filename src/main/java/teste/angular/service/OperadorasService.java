package teste.angular.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teste.angular.domain.Contatos;
import teste.angular.domain.Operadoras;
import teste.angular.repositories.OperadorasRepository;
import teste.angular.service.exception.ObjectNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class OperadorasService {

    @Autowired
    OperadorasRepository operadorasRepository;

    public Operadoras find(Integer id) {
        Optional<Operadoras> obj = operadorasRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Operadoras.class.getName()));
    }

    public  List<Operadoras> findAll() {
        return operadorasRepository.findAll();
    }
}
