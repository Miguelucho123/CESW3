package com.cesw3.facturas.backend.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexionBD {

	private static Connection conexion;
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://localhost:3306/facturabd";
	private ResultSet rs;
	private Statement st;
	

	public ConexionBD() {
		conexion = null;
		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(url, user, password);
			if (conexion != null) {
				System.out.println("Conexion establecida.");
				JOptionPane.showMessageDialog(null, "SE CONECTÓ BIEN");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public Connection getConnection() {
		return conexion;
	}

	public void desconectar() {
		conexion = null;
		if (conexion == null) {
			System.out.println("se ha desconectado la conexión.");
		}
	}
	
	
	public static void main (String [] args) {
		ConexionBD mibd = new ConexionBD();
		
		System.out.println(mibd.getConnection());
		mibd.desconectar();
	}
	
	

}
