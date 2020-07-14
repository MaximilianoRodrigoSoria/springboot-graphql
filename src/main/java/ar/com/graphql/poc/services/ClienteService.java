package ar.com.graphql.poc.services;

import ar.com.graphql.poc.persistence.entities.Cliente;

import java.util.List;

public interface ClienteService {

    public Cliente findById(long id);
    public List<Cliente> findAll();
    public void save(Cliente cliente);
    public void delete(Long id);
}
