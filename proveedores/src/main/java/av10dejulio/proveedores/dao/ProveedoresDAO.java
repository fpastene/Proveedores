package av10dejulio.proveedores.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import av10dejulio.proveedores.bean.ProveedoresBean;

import java.util.List;
@Repository
public interface ProveedoresDAO extends JpaRepository<ProveedoresBean, Integer>{
	
	@Query(value="SELECT DISTINCT 	1 as idSucursal"
			+ ",1 as tipoSucursal,'a' as nombreFantasia"
			+ ",'1' as fono,'a' as email,'a' as web"
			+ ",'1' as calle,'1' as numero"
			+ ",'1' as ubicacionMapa "
			+ "FROM sucursal ", nativeQuery=true)
	
	List<ProveedoresBean> buscarPorValor(String valor1);

}
