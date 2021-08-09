package av10dejulio.proveedores.service;

import java.util.List;
import av10dejulio.proveedores.bean.ProveedoresBean;

public interface ProveedoresService {
	
	public List<ProveedoresBean> BuscarPorValor(String valorParam);

}
