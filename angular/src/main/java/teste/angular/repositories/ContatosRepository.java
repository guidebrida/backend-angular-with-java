package teste.angular.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teste.angular.domain.enums.Contatos;

@Repository
public interface ContatosRepository extends JpaRepository<Contatos, Integer> {


}