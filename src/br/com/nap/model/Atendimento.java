package br.com.nap.model;

import java.sql.Date;

public class Atendimento {
	
	long idMarcacao;
	int numeroMarcacao;
	Usuario usuarioAtendimento;
	Date dataMarcacao;
	Produto produto;
	double qtdProduto;
	double vlTotal = qtdProduto * produto.getPrecoProduto();
	
	
	public long getIdMarcacao() {
		return idMarcacao;
	}
	public void setIdMarcacao(long idMarcacao) {
		this.idMarcacao = idMarcacao;
	}
	public Usuario getUsuarioMarcacao() {
		return usuarioAtendimento;
	}
	public void setUsuarioMarcacao(Usuario usuarioMarcacao) {
		this.usuarioAtendimento = usuarioMarcacao;
	}
	public Date getDataMarcacao() {
		return dataMarcacao;
	}
	public void setDataMarcacao(Date dataMarcacao) {
		this.dataMarcacao = dataMarcacao;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(double qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public int getNumeroMarcacao() {
		return numeroMarcacao;
	}
	public void setNumeroMarcacao(int numeroMarcacao) {
		this.numeroMarcacao = numeroMarcacao;
	}
	
	public double getVlTotal() {
		return this.vlTotal;
	}
	
	
}
