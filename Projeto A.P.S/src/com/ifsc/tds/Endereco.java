package com.ifsc.tds;

public class Endereco {
	
	public Endereco (String rua, int numero, String cep, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.cep= cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	private String rua;
	
	private int numero;
	
	private String cep;
	
	private String cidade;
	
	private String estado;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String toString() {
		String texto;
		
		texto = "---------------" + "\nEstado: " +getEstado() + "\nCidade:" + "\nCEP" + getCep() + "\nRua: " +getRua() + "\nNumero: " + getNumero();
		
		return texto;
	}

}
