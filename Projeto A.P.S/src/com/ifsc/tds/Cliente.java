package com.ifsc.tds;

public class Cliente  {
	
	private int clienteld;
	
	private String nome;
	
	private Endereco endereco;
	
	

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
	
	
}
