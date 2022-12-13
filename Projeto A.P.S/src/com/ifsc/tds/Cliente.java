package com.ifsc.tds;

public abstract class Cliente  {
	
	public Cliente (int clienteId, String nome, Endereco endereco, Fatura fatura) {
		this.clienteld = clienteId;
		this.nome = nome;
		this.endereco = endereco;
		this.fatura= fatura;
	}
	
	private Fatura fatura;
	
	private int clienteld;
	
	private String nome;
	
	private Endereco endereco;

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getClienteld() {
		return clienteld;
	}

	public void setClienteld(int clienteld) {
		this.clienteld = clienteld;
	}
	
	public String toString () {
		String texto;
		
		texto = "--------------------" + "\nNome: " + getNome() + "\nEndereço" + getEndereco() + "\n ID do Cliente: " + getClienteld();
		
		return texto; 
	}
	
	
}
