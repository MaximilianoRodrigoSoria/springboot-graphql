package ar.com.graphql.poc.services;

import ar.com.graphql.poc.persistence.entities.Compra;

import java.util.List;

public interface CompraService {

    public Compra findById(long id);
    public List<Compra> findAll();
    public void save(Compra compra);
    public void delete(Long id);
}
