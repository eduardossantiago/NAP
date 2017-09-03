package br.com.nap.model;

import java.util.List;

public class Comanda {
	
	private int numero;
	private List<Marcacao> marcacoes;
	

	public int getNumber() {
		return numero;
	}
	public void setNumber(int numero) {
		this.numero = numero;
	}
	public List<Marcacao> getMarcacoes() {
		return marcacoes;
	}
	public void setMarcacoes(List<Marcacao> marcacoes) {
		this.marcacoes = marcacoes;
	}
	
	public void addMarcacao(Marcacao marcacao) {
		marcacoes.add(marcacao);
	}
	
	public void removeMarcacao(Marcacao marcacao) {
		marcacoes.remove(marcacao.getNumeroMarcacao());
	}
	

}
