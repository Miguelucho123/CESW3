package com.cesw3.facturas.backend.actions;

import com.cesw3.facturas.backend.util.ConexionBD;

public class ActionBD {
	ConexionBD mibd = new ConexionBD();
	public String isConnected() {
		
		mibd.getConnection();
		mibd.desconectar();
		
		return "todo gud";
		
		
	}

}
