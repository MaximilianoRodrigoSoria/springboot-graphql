package ar.com.graphql.poc.graphql;


import ar.com.graphql.poc.persistence.entities.Cliente;
import ar.com.graphql.poc.services.ClienteService;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class ClienteGraphQL implements GraphQLQueryResolver {


    private ClienteService clienteService;


    public Cliente getCliente(long id){
        return clienteService.findById(id);
    }

    public List<Cliente> getClientes()
        {
            return clienteService.findAll();
        }

    public String saveCliente(Cliente cliente) {
    	clienteService.save(cliente);
    	return "Cliente guardado con exito";
    }
    
    
    @Autowired
    public void setClienteService(ClienteService clienteService)
    {
        this.clienteService = clienteService;
    }
}
