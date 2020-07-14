package ar.com.graphql.poc.graphql;


import ar.com.graphql.poc.persistence.entities.Cliente;
import ar.com.graphql.poc.persistence.inputs.ClienteInput;
import ar.com.graphql.poc.services.ClienteService;

import ch.qos.logback.core.net.server.Client;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Component
public class ClienteGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {


    private ClienteService clienteService;


    public Cliente getCliente(long id){
        return clienteService.findById(id);
    }

    public List<Cliente> getClientes()
        {
            return clienteService.findAll();
        }

    @Transactional
    public Cliente saveCliente(ClienteInput input) {
        ModelMapper  mm = new ModelMapper();
        Cliente cliente = mm.map(input, Cliente.class);
        clienteService.save(cliente);
    	return cliente;
    }

    @Transactional
    public Cliente updateCliente(ClienteInput ci) {
        ModelMapper  mm = new ModelMapper();
        Cliente cliente = mm.map(ci, Cliente.class);
        clienteService.save(cliente);
        return cliente;
    }

    public Cliente deleteCliente(Long id)
        {
            Cliente cliente = new Cliente();
            cliente = clienteService.findById(id);
            if(cliente!=null) {
                clienteService.delete(id);
            }
           return cliente;
        }

    @Autowired
    public void setClienteService(ClienteService clienteService)
    {
        this.clienteService = clienteService;
    }
}
