package ar.com.graphql.poc.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.graphql.poc.persistence.entities.Compra;

public interface CompraRepository extends JpaRepository<Compra, Long>{

}
