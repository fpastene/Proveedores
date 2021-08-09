package av10dejulio.proveedores.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProveedoresBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idSucursal;	
	private Integer tipoSucursal;
	private String nombreFantasia;
	private String fono;
	private String email;
	private String web;
	private String calle;
	private String numero;	
	private String ubicacionMapa;

}
