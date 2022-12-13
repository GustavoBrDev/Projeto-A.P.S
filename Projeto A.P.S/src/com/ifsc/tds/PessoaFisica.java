package com.ifsc.tds;

public class PessoaFisica extends Cliente {
	
	public PessoaFisica(int clienteId, String nome, Endereco endereco, String cpf, Fatura fatura) {
		super(clienteId, nome, endereco, fatura);
		this.cpf = cpf;
	}

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString () {
		String texto;
		
		texto = super.toString();
		
		texto += "\nCPF: " + getCpf();
		
		return texto;  
	}
	
}
