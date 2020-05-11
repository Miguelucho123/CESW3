package com.cesw3.facturas.backend.actions;

import java.sql.SQLException;
import java.sql.Statement;

import com.cesw3.facturas.backend.util.ConexionBD;

public class ActionBD {
	ConexionBD mibd = new ConexionBD();
	public String isConnected() {
		
		mibd.getConnection();
		mibd.desconectar();
		
		return "todo gud";
		
		
	}
	
	public void ingresarTipoFactura(int idTipo, String nombreTipo) {
		try {
			Statement crear = mibd.getConnection().createStatement();
			
			String queryTipo="INSERT INTO `tipos_productostbl`(`id_tipo`, `nombre_tipo`) VALUES ("+idTipo+",'"+nombreTipo+"')";
			crear.executeUpdate(queryTipo);
			mibd.desconectar();
			
			System.out.println("listo");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
