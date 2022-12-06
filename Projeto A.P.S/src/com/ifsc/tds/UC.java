package com.ifsc.tds;

public class UC {
	private int ucld;
	
	private Cliente cliente;
	
	private int LeituraAnterior;
	
	private int LeituraAtul;
	
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
		return LeituraAnterior;
	}

	public void setLeituraAnterior(int leituraAnterior) {
		LeituraAnterior = leituraAnterior;
	}

	public int getLeituraAtul() {
		return LeituraAtul;
	}

	public void setLeituraAtul(int leituraAtul) {
		LeituraAtul = leituraAtul;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
