package ar.com.graphql.poc.services.impl;

import ar.com.graphql.poc.persistence.entities.Compra;
import ar.com.graphql.poc.persistence.repositories.CompraRepository;
import ar.com.graphql.poc.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {

   
    private CompraRepository compraRespository;

    @Override
    @Transactional(readOnly=true)
    public Compra findById(long id) {
        return compraRespository.findById(id).get();
    }

    @Override
    @Transactional(readOnly=true)
    public List<Compra> findAll() {
        return compraRespository.findAll();
    }

	@Override
	public void delete(Long id) {
		if(compraRespository.findById(id).isPresent()) 
		{ 
			compraRespository.deleteById(id);
		}
		
	}

	@Override
	public void save(Compra compra) {
		compraRespository.save(compra);
		
	}
	
	 @Autowired
	 public void setCompraRepository(CompraRepository compraRepository)
	  { this.compraRespository = compraRepository;}
	
}
