package teste.angular.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teste.angular.domain.Operadoras;

@Repository
public interface OperadorasRepository extends JpaRepository<Operadoras, Integer> {


}
