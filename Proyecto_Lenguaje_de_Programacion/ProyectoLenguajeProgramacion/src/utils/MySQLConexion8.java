package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConexion8 {
	//metodo encargado de hacer la conexion con la BD
	public static Connection getConexion() {
		//declarando el tipo de objeto "connection"
		Connection con = null;
		try {
			//estableciendo ruta del driver de conexion --> nombre del paquete 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Datos de conexion
			         //driver:protocoloDriver/ubicacion/nombreBD/actualizacion
			String url = "jdbc:mysql://localhost:3306/ciberfarma?serverTimezone=UTC";
			String usr = "root";//root
			String psw = "mysql";//contraseña
			con = DriverManager.getConnection(url, usr, psw);
		} catch (ClassNotFoundException e) {
			System.out.println("Error >> Driver no Instalado!!" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Error >> de conexión con la BD" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error >> general : " + e.getMessage());
		} 
		return con;
	}

}
