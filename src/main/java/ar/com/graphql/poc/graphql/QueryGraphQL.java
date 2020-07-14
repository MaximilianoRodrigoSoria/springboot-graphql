package ar.com.graphql.poc.graphql;


import ar.com.graphql.poc.persistence.entities.Cliente;
import ar.com.graphql.poc.persistence.repositories.ClienteRespository;
import ar.com.graphql.poc.services.ClienteService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {


    private ClienteService clienteService;

    public String hello() {
        return "Hola mundo!!!";
    }
    public int suma(int a, int b) {
        return a + b;
    }
    public Cliente getCliente(long id){
        return clienteService.findById(id);
    }

    public List<Cliente> getClientes()
        {
            return clienteService.findAll();
        }

    @Autowired
    public void setClienteService(ClienteService clienteService)
    {
        this.clienteService = clienteService;
    }
}
