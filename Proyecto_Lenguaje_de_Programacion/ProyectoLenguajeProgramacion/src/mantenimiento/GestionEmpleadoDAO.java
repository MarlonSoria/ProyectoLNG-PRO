package mantenimiento;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entidad.Empleado;
import interfaces.EmpleadoInterfacesDAO;
import utils.MySQLConexion8;

public class GestionEmpleadoDAO implements EmpleadoInterfacesDAO{

	@Override
	public int registrar(Empleado u) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			//Paso 1:Establecer la conexion con la BD
			con =MySQLConexion8.getConexion();
			//Paso 2:determinar la instruccion SQL -->Registrar
			String sql ="insert into tb_usuarios values (null,?,?,?,?,?,default,default)";
			//paso 3:Crear el objeto pstm y enviar la variable al sql 
			pstm = con.prepareStatement(sql);
			//Paso 4:Parametros
			pstm.setString(1,u.getNombre());
			pstm.setString(2,u.getApellido());
			pstm.setNString(3,u.getUsuario());
			pstm.setNString(4,u.getClave());
			pstm.setNString(5,u.getFNacim());
			//Paso 5:Ejecutar la instruccion
			res = pstm.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(">>>>>>>>>>Error en la Instruccion - Registrar" + e.getMessage());
		}finally {
			try {
				if(pstm != null) pstm.close();
				if(pstm != null)con.close();
			} catch (Exception e2) {
				System.out.println("<<<<Error al cerrar la base de datos" + e2.getMessage());
			}
		}
		return res;
	
	}

	@Override
	public int actualizar(Empleado u) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			//Paso 1:Establecer la conexion con la BD
			con =MySQLConexion8.getConexion();
			//Paso 2:determinar la instruccion SQL -->Actualiza
			//
			String sql ="update tb_usuarios set nombre = ?, apellido = ?,usuario = ?,clave = ?,fnacim = ? where codigo = ?";
			//Paso3:Enviar la instruccion al objeto pstm --->obtener comandos SQL
			pstm = con.prepareStatement(sql);
			//Paso 4:Parametros 
			pstm.setString(1,u.getNombre());
			pstm.setString(2,u.getApellido());
			pstm.setString(3,u.getUsuario());
			pstm.setString(4,u.getClave());
			pstm.setString(5,u.getFNacim());
			pstm.setInt(6,u.getCodigo());
		   //Paso 5:Ejecutar Instruccion
			res = pstm.executeUpdate();
			System.err.println("ok");
			
		} catch (Exception e) {
			System.out.println(">>>>>>>>>>Error en la Instruccion - Actualizar" + e.getMessage());
		}finally {
			try {
				if(pstm != null) pstm.close();
				if(pstm != null)con.close();
			} catch (Exception e2) {
				System.out.println("<<<<Error al cerrar la base de datos" + e2.getMessage());
			}
		}
		
		return res;
		
	}

	@Override
	public int eliminar(int codigo) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			//Paso 1:Establecer la conexion con la BD
			con =MySQLConexion8.getConexion();
			//Paso 2:determinar la instruccion SQL -->Actualiza
			String sql ="delete from tb_usuarios where codigo = ?";
			//paso3:enviar la instruccion al objeto pstm --->Obtener comandos SQL
			pstm = con.prepareStatement(sql);
			//paso4: parametros
			pstm.setInt(1, codigo);
			//5.Ejecutar Instruccion
			res = pstm.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(">>>>>>>>>>Error en la Instruccion - Eliminar" + e.getMessage());
		}finally {
			try {
				if(pstm != null) pstm.close();
				if(pstm != null)con.close();
			} catch (Exception e2) {
				System.out.println("<<<<Error al cerrar la base de datos" + e2.getMessage());
			}
		}
		
		return res;
	}

	

}
