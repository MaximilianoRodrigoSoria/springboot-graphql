package ar.com.graphql.poc.services.impl;

import ar.com.graphql.poc.persistence.entities.Cliente;
import ar.com.graphql.poc.persistence.repositories.ClienteRespository;
import ar.com.graphql.poc.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRespository clienteRespository;

    @Override
    public Cliente findById(long id) {
        return clienteRespository.findById(id).get();
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRespository.findAll();
    }
}
