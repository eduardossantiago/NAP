package br.com.nap.model;

import java.util.List;

public class Comanda {
	
	private long idComanda;
	private int statusUtilizada;//retorna true quando utilizada em algum terminal de atendimento
	
	
	public long getIdComanda() {
		return idComanda;
	}
	public void setIdComanda(long idComanda) {
		this.idComanda = idComanda;
	}
	public int isStatusUtilizada() {
		return statusUtilizada;
	}
	public void setStatusUtilizada(int statusUtilizada) {
		this.statusUtilizada = statusUtilizada;
	}
	

}
