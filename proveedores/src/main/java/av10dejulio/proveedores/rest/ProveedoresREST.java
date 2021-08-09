package av10dejulio.proveedores.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import av10dejulio.proveedores.service.ProveedoresService;
import av10dejulio.proveedores.bean.ProveedoresBean;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;




@RestController 
@RequestMapping("proveedores")

public class ProveedoresREST {
	
	@Autowired
	private ProveedoresService consproveedores;
	
	
	//http://localhost:8080/prueba/buscar/citroen
	//recibo por url ..param con datos en tabla citroen y pluma
	
		@GetMapping("/buscar/{nombre}")
		public List<ProveedoresBean> buscar(@PathVariable("nombre") String nombre) {
		
			// nombre se envia 4 veces ya que query native usa cuatro veces el parametro
			
			return consproveedores.BuscarPorValor(nombre);
				
			

		}

		

}
