package br.com.nap.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ComandaDAO {
	
	Connection con;
	
	public ComandaDAO(Connection con) {
		
		this.con = con;
		
	}
	
	public int verStatus(Comanda comanda) {//ver se comanda está sendo utilizada ou não
		
		String sql = "SELECT * FROM mt_comandas where idcomanda = ?";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setLong(1, comanda.getIdComanda());
			
			ResultSet rs = stmt.executeQuery();
			
			
			if(rs.wasNull()) {//se nao retornar resultados no select:
					
				return 0;//comanda não utilizada
				
			}else {//caso select retorne algo
				
				return 1;//comanda sendo utilizada
			}
			
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}//fim verStatus
	
	public void abrirComanda(Comanda comanda) {
		
		String sql = "inserto into mt_comandas(idcomanda, statusutilizada) values (?, 1)";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setLong(1, comanda.getIdComanda());
			
			stmt.close();
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
