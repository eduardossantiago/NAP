package br.com.nap.model;

import java.sql.Connection;

public class ComandaDAO {
	
	Connection con;
	
	public ComandaDAO(Connection con) {
		
		this.con = con;
		
	}
	
	public Comanda getComandaPorNumero(long numero) {
		
	}

}
