package ar.com.graphql.poc.persistence.repositories;

import ar.com.graphql.poc.persistence.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRespository extends JpaRepository<Cliente, Long> {
}
