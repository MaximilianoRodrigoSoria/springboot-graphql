package ar.com.graphql.poc.graphql;

import ar.com.graphql.poc.model.pojo.Cliente;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

    public String hello() {
        return "Hola mundo!!!";
    }
    public int suma(int a, int b) {
        return a + b;
    }
    public Cliente getCliente(){
        return new Cliente("Maximiliano","Soria","34080910","max@gmail.com");
    }

    public List<Cliente> getClientes()
        {
            List<Cliente> lista = new ArrayList<>();
            for (int i=0;i<10;i++)
            { lista.add(new Cliente("Cliente"+i,"Ape"+1,"3408091"+i,"Cliente"+i+"@gmail.com"));}
            return lista;
        }
}
