package interfaces;

import entidad.Empleado;

public interface EmpleadoInterfacesDAO {
	//registrar
	public int registrar(Empleado u);
	//actualizar
	public int actualizar(Empleado u);
	//eliminar
	public int eliminar(int codigo);
	//listar
	

}
