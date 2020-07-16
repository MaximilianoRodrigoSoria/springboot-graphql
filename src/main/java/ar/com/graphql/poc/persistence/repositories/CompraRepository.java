package ar.com.graphql.poc.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.graphql.poc.persistence.entities.Compra;

import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long>{
    public List<Compra> findAllByCliente(Long id);

}
