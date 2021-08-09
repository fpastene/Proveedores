package av10dejulio.proveedores.service.impl;

//import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.persistence.Query;

//import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import av10dejulio.proveedores.service.ProveedoresService;

import av10dejulio.proveedores.bean.ProveedoresBean;
import av10dejulio.proveedores.dao.ProveedoresDAO;

@Service
public class ProveedoresServiceImpl implements ProveedoresService {
	
	
	//private final ModelMapper mm = new ModelMapper();
	@Autowired
	private ProveedoresDAO proveedoresDAO;	
	
	
	@Override
    public List<ProveedoresBean> BuscarPorValor(String ValorParam){
        
		
		
		return proveedoresDAO.buscarPorValor(ValorParam);
        
    }
	

}
