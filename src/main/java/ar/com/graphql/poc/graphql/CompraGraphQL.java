package ar.com.graphql.poc.graphql;


import ar.com.graphql.poc.persistence.entities.Cliente;
import ar.com.graphql.poc.persistence.entities.Compra;

import ar.com.graphql.poc.persistence.entities.Producto;
import ar.com.graphql.poc.services.ClienteService;
import ar.com.graphql.poc.services.CompraService;
import ar.com.graphql.poc.services.ProductoService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompraGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {



   private CompraService compraService;


   public Compra getCompra(long id){
      return compraService.findById(id);

   }



   @Autowired
   public void setCompraService(CompraService compraService)
   {this.compraService = compraService;
   }



}
