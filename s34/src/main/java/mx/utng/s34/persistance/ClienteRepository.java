package mx.utng.s34.persistance;

import mx.utng.s34.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

     
}