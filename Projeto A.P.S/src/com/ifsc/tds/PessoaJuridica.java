package com.ifsc.tds;

public class PessoaJuridica extends Cliente {

	public PessoaJuridica(int clienteId, String nome, Endereco endereco, String cpnj) {
		super(clienteId, nome, endereco);
		this.cpnj = cpnj;
	}

	private String cpnj;

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	
	public String toString() {
		String texto;
		
		texto = super.toString();
		
		texto += "\nCPNJ: " + getCpnj();
		
		return texto; 
	}
	
}
