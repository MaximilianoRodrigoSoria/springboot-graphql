package ar.com.graphql.poc.graphql;


import ar.com.graphql.poc.persistence.entities.Cliente;
import ar.com.graphql.poc.persistence.entities.Producto;
import ar.com.graphql.poc.persistence.inputs.ClienteInput;
import ar.com.graphql.poc.persistence.inputs.ProductoInput;
import ar.com.graphql.poc.services.ProductoService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ProductoGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {


   private ProductoService productoService;


   public Producto getProducto(long id){
      return productoService.findById(id);

   }

   public List<Producto> getProductos()
   {
      return productoService.findAll();
   }

   @Transactional
   public Producto updateProducto(ProductoInput pr) {
      ModelMapper mm = new ModelMapper();
      Producto producto = mm.map(pr, Producto.class);
      productoService.save(producto);
      return producto;
   }

   @Transactional
   public Producto deleteProducto(Long id)
   {
      Producto producto = new Producto();
      producto = productoService.findById(id);
      if(producto!=null) {
         productoService.delete(id);
      }
      return producto;
   }

   @Transactional
   public Producto saveProducto(ProductoInput input) {
      ModelMapper  mm = new ModelMapper();
      Producto producto = mm.map(input, Producto.class);
      productoService.save(producto);
      return producto;
   }

   @Autowired
   public void setProductoService(ProductoService productoService)
   {this.productoService = productoService;
   }

}
