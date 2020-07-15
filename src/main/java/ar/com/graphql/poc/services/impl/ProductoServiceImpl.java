package ar.com.graphql.poc.services.impl;

import ar.com.graphql.poc.persistence.entities.Producto;
import ar.com.graphql.poc.persistence.repositories.ProductoRepository;
import ar.com.graphql.poc.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

   
    private ProductoRepository productoRespository;

    @Override
    @Transactional(readOnly=true)
    public Producto findById(long id) {
        return productoRespository.findById(id).get();
    }

    @Override
    @Transactional(readOnly=true)
    public List<Producto> findAll() {
        return productoRespository.findAll();
    }

	@Override
	public void delete(Long id) {
		if(productoRespository.findById(id).isPresent()) 
		{ 
			productoRespository.deleteById(id);
		}
		
	}

	@Override
	public void save(Producto producto) {
		productoRespository.save(producto);
		
	}
	
	 @Autowired
	 public void setProductoRepository(ProductoRepository productoRepository)
	  { this.productoRespository = productoRepository;}
	
}
