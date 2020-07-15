package ar.com.graphql.poc.services;

import ar.com.graphql.poc.persistence.entities.Producto;

import java.util.List;

public interface ProductoService {

    public Producto findById(long id);
    public List<Producto> findAll();
    public void save(Producto producto);
    public void delete(Long id);
}
