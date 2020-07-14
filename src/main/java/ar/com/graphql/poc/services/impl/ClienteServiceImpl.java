package ar.com.graphql.poc.services.impl;

import ar.com.graphql.poc.persistence.entities.Cliente;
import ar.com.graphql.poc.persistence.repositories.ClienteRespository;
import ar.com.graphql.poc.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRespository clienteRespository;

    @Override
    @Transactional(readOnly=true)
    public Cliente findById(long id) {
        return clienteRespository.findById(id).get();
    }

    @Override
    @Transactional(readOnly=true)
    public List<Cliente> findAll() {
        return clienteRespository.findAll();
    }

	@Override
	public void delete(Long id) {
		if(clienteRespository.findById(id).isPresent()) 
		{ 
			clienteRespository.deleteById(id);
		}
		
	}

	@Override
	public void save(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
}
