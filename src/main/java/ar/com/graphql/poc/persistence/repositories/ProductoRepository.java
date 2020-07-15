package ar.com.graphql.poc.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.graphql.poc.persistence.entities.Producto;


public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
