package com.ifsc.tds;

public class UC {
	
	public UC (int ucId, Cliente cliente, int leituraAnterior, int leituraAtual) {
		this.ucld = ucId;
		this.cliente = cliente;
		this.leituraAnterior = leituraAnterior;
		this.leituraAtual = leituraAtual;
	}
	
	private int ucld;
	
	private Cliente cliente;
	
	private int leituraAnterior;
	
	private int leituraAtual;
	
	private Endereco endereco;

	public int getUcld() {
		return ucld;
	}

	public void setUcld(int ucld) {
		this.ucld = ucld;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getLeituraAnterior() {
		return leituraAnterior;
	}

	public void setLeituraAnterior(int leituraAnterior) {
		this.leituraAnterior = leituraAnterior;
	}

	public int getLeituraAtual() {
		return leituraAtual;
	}

	public void setLeituraAtual(int leituraAtul) {
		this.leituraAtual = leituraAtul;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String toString () {
		String texto;
		
		texto = "------------" + "\n\nCliente: \n " + getCliente().toString() + "\n\nLeitura Atual: " + getLeituraAtual() + "\nLeitura anterior: " + getLeituraAnterior() + "\n\nEndereco: \n" + endereco.toString() + "\n\n\nID da Unidade Consumidora: " + getUcld();
		
		return texto; 
	}
	
	public int faturar (int leitura) {
		return leitura;
	}
	
	public int pegarConsumo () {
		return 0;
	}

}
